package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //시작 페이지
    @GetMapping("/")
    public String index() {
        return "index"; //resource\templates\index라는 html 파일을 띄움
    }

}
