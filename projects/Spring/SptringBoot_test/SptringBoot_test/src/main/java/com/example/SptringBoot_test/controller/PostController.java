package com.example.SptringBoot_test.controller;

import com.example.SptringBoot_test.dto.MemberDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/post-api") //공통되는 URL 추가
public class PostController {

    @PostMapping("/default")
    public String postMethod() {
        return "Hello World";
    }

    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Objects> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PostMapping("/member2")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
