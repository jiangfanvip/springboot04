package com.jiangfan.springboot04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 江帆
 * @Date: 2020/6/21NT
 * @Description: com.jiangfan.springboot04
 * @version: 1.0
 */
@RestController
public class UserController {
     @GetMapping("/hello")
    public String hello() {
        return "springBoot04";
    }
}
