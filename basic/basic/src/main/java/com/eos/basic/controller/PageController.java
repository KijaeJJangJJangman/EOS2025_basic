package com.eos.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";  // templates/welcome.html 로 연결됨
    }
}
