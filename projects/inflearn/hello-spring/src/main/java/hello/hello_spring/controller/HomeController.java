package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController { //회원 웹 기능 - 홈 화면 추가
    @GetMapping("/") //로컬 8080로 접속시 해당 코드가 실행되고,
    public String home() {
        return "home"; // resources\templates에 있는 `home`.html이라는 이름의 파일이 실행됨
    }
}
