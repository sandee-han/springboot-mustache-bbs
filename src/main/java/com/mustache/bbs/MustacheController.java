package com.mustache.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username" , "kaan");
        return "greetings";
    }

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon2(@PathVariable String id, Model model) {
        model.addAttribute("username", "hankan");// view에 값을 넘김
        model.addAttribute("id", id);// view에 값을 넘김
        return "greetings"; // greetings라는 이름의 view를 리턴
    }
}
