package com.shihaohu.controller;

import com.shihaohu.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ShiHaoHu
 * @date 2024/5/9 10:20
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save");
        return "{'info' : 'SpringMvc'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name) {
        System.out.println("common param ->" + name);
        return "{'module' : 'commonParam'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo param ->" + user);
        return "{'module' : 'pojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] dudu) {
        System.out.println("array param ->" + Arrays.toString(dudu));
        return "{'module' : 'arrayParam'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam("dudu") List<String> dudus) {
        System.out.println(dudus);
        return "{'module' : 'listParam'}";
    }

    @RequestMapping("/pojoParams")
    @ResponseBody
    public String pojoParams(@RequestBody List<User> list) {
        System.out.println("pojo params ->" + list);
        return "{'module' : 'pojoParams'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dataParam(Date date) {
        System.out.println("date params->" + date);
        return "{'module' : 'dateParams'}";
    }

    @RequestMapping("/dateParam2")
    @ResponseBody
    public String dataParam2(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss") Date date2) {
        System.out.println("data params ->" + date);
        System.out.println("data params ->" + date2);
        return "{'module' : 'dateParams'}";
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList() {
        System.out.println("toJsonList");
        User user1 = new User();
        user1.setUserName("shihaohu");
        user1.setUserAge(19);
        User user2 = new User();
        user2.setUserName("胡仕豪");
        user2.setUserAge(19);
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("Users getById->" + id);
        return "{'module':'user getById'}";
    }

}
