package com.example.shop.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    //DB 데이터 출력을 위해 출력할 데이터들 입력

}
