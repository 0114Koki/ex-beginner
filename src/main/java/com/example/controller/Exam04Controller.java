package com.example.controller;

import com.example.domain.User;
import com.example.form.Exam04Form;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {


    @GetMapping("")
    public String index(Exam04Form form){

        return "exam04";
    }

    @PostMapping("/post")
    public String post(
            @Validated Exam04Form form
            , BindingResult result
            , RedirectAttributes redirectAttributes
            , Model model
    ){
        if(result.hasErrors()){
            return index(form);
        }

        User user = new User();
        BeanUtils.copyProperties(form, user);
        user.setAge(form.getIntAge());

        redirectAttributes.addFlashAttribute("user", user);
        return "redirect:/exam04/to-result";
    }

    @GetMapping("/to-result")
    public String toResult(){
        return "exam04-result";
    }
}
