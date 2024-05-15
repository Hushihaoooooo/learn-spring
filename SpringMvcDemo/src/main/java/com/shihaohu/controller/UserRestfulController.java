package com.shihaohu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShiHaoHu
 * @date 2024/5/10 18:37
 * @description
 */
@RestController
@RequestMapping("/user2")
public class UserRestfulController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("Restful getById->" + id);
        return "{'module':'Restful user getById'}";
    }
}
