package cn.edu.zust.se.controller;

import cn.edu.zust.se.model.vo.EquipmentVo;
import cn.edu.zust.se.model.vo.UserVo;
import cn.edu.zust.se.service.EquipmentService;
import cn.edu.zust.se.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ShiHaoHu
 * @description
 * @since 2024/6/6 00:20
 */
@Controller
public class UserController {
    UserService userService = new UserService();
    EquipmentService equipmentService = new EquipmentService();

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {
        //System.out.println(username + password);
        UserVo u = userService.getUser(userName);
        if (u != null && u.getPassword().equals(password)) {
            session.setAttribute("userName", u.getUserName());
            session.setAttribute("status", (u.getType().equals("0") ? "管理员" : "普通用户"));
            return "redirect:/home";
        } else {
            model.addAttribute("loginErrorMessage", "用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    public String register(@ModelAttribute UserVo user,
                           Model model) {
        UserVo u = userService.getUser(user.getUserName());
        if (u == null) {
            userService.register(user);
            model.addAttribute("loginErrorMessage", "请登陆");
        } else {
            model.addAttribute("loginErrorMessage", "该用户已经存在");
        }
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpSession session, Model model) {
        String userName = (String) session.getAttribute("userName");
        String status = (String) session.getAttribute("status");
        System.out.println(userName + status);
        model.addAttribute("userName", userName);
        model.addAttribute("status", status);
        List<EquipmentVo> equipmentVos = new ArrayList<EquipmentVo>();
        if (status.equals("普通用户")) {
            equipmentVos = equipmentService.getEquipment(userName);
        } else {
            List<UserVo> userVos = userService.listUsers();
            System.out.println(userVos);
            model.addAttribute("userList", userVos);
            equipmentVos = equipmentService.getAllEquipment();
        }
        System.out.println(equipmentVos);
        model.addAttribute("equipmentVos", equipmentVos);
//        // 调试信息
//        System.out.println("Equipment List: " + equipmentVo);
        return "home";
    }

    @RequestMapping(value = "/addEquipment", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    public String addEquipment(@ModelAttribute EquipmentVo equipmentVo,
                               Model model,
                               HttpSession session) {
        System.out.println(equipmentVo);
        equipmentService.addEquipment(equipmentVo);
        return "redirect:home";
    }


}
