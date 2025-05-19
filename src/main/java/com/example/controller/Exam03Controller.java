package com.example.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @Autowired
    private ServletContext application;

    @GetMapping("")
    public String index(){
        return "exam03";
    }

    @PostMapping("/calc")
    public String calc(Integer num1, Integer num2, Integer num3){
        int result = num1 + num2 + num3;
        double resultTax = result * 1.1;
        application.setAttribute("result", result);
        application.setAttribute("resultTax", (int)resultTax);
        return "exam03-result";
    }
}
