package com.example.shop.member;

import com.example.shop.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findAllByUsername(String username);
    //Derived query methods

}
