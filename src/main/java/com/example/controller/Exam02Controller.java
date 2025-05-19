package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @GetMapping("")
    public String index(){
        return "exam02";
    }

    @PostMapping("/add")
    public String add(Integer num1, Integer num2, Model model){
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", num1+num2);
        return "exam02-result";
    }
    @GetMapping("/to-page2")
    public String toPage2(){
        return "exam02-result2";
    }
}
