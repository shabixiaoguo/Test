package com.wcg.skr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {
    @RequestMapping("/skr")
    @ResponseBody
    public String quick(){
        return "Hei Fuck You!!! WDNMD";
    }
}
