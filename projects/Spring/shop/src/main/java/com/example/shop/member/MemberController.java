package com.example.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    //회원가입 pw 해싱
    @PostMapping("/member")
    public String addMember(String username, String password, String displayName) {
        memberService.register(username, password, displayName);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    //마이페이지
    @GetMapping("/mypage")
    public String myPage(Authentication auth) { // 현재 로그인되어있는 사용자의 정보가 담겨있음
        System.out.println(auth);
        System.out.println(auth.getName()); //아이디출력가능
        System.out.println(auth.isAuthenticated()); //로그인여부 검사가능

        return "mypage.html";
    }
}
