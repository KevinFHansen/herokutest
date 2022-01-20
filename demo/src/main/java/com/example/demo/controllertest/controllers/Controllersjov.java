package com.example.demo.controllertest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllersjov {

    @GetMapping("/hej")
    public String test(){
        return "index1";
    }
}
