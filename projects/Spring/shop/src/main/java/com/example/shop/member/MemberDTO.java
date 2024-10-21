package com.example.shop.member;

import lombok.Data;

@Data
public class MemberDTO {
    public String username;
    public String displayName;

    public MemberDTO(String username, String displayName) {
        this.username = username;
        this.displayName = displayName;
    }
}
