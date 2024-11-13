package com.example.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    //사용자가 입력한 id를 가져와 db에서 입력한 id가 있는지 확인
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //DB에서 username을 가진 유저를 찾아와서
        //return new User(유저아이디, 비번, 권한)
        Optional<Member> findMember = memberRepository.findAllByUsername(username);
        if (findMember.isEmpty()) {
            throw new UsernameNotFoundException("입력한 아이디가 없습니다.");
        }
        var user = findMember.get();
        //권한
        List<GrantedAuthority> role = new ArrayList<>();
        role.add(new SimpleGrantedAuthority("일반유저"));

        var customData = new CustomUser(user.getUsername(),user.getPassword(),role,user.displayName);
        return customData;
    }
}