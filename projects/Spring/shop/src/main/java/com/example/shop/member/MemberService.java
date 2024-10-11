package com.example.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    //회원 가입
    public void register(String username, String password, String displayName) {
        Member member = new Member();
        member.setUsername(username);
        //비밀번호 암호화 및 중복 아이디시 오류 문구 출력
        try {
            var hash= passwordEncoder.encode(password);
            member.setPassword(hash);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateKeyException("존재하는 아이디 입니다");
        }
        member.setDisplayName(displayName);
        memberRepository.save(member);
    }

}
