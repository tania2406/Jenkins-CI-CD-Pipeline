package com.Jenkins_Pipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @RequestMapping ("/test")
    public String test()
    {
        return " this is test for jenkins pipeline";
    }
}
