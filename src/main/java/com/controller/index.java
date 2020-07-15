package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuexin
 * @creat 2020/6/24 21:08
 */
@RestController
public class index
{
    @GetMapping("/eg")
    public String dr()
    {
        return "xuexinzhenshuai";
    }
}
