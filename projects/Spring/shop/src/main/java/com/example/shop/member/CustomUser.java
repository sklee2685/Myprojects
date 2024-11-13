package com.example.shop.member;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CustomUser extends User{
    public String displayName;
    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities,String displayName) {
        super(username,password,authorities);
        this.displayName = displayName;
    }
}
