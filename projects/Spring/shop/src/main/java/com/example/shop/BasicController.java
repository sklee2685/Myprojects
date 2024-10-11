package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/") // 누가 메인페이지에 접속하면
    String hello(){
        return "/login.html"; // 해당 문자열을 반환
    }

    //추가
    @GetMapping("/hello") // localhost:8080/hello 로 접속하면
    @ResponseBody
    String helloWorld(){
        return "hello world"; // 해당 문자열을 반환
    }

    //html 태그도 가능
    @GetMapping("/hi")
    @ResponseBody
    String html(){
        return "<h1>html태그 반환</h1>";
    }

    //html 파일 보내기
    @GetMapping("/index")
    String mainPage(){
        return "index.html";
    }

    //누가 /date 로 접속하면 현재 날짜와 시간을 보내주는 기능 만들기
    @GetMapping("/date")
    @ResponseBody
    String dt(){
        return ZonedDateTime.now().toString();
    }
}
