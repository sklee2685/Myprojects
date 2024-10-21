package com.example.shop.item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
    //DB 데이터 출력을 위해 출력할 데이터들 입력
    Page<Item> findPageBy(Pageable page);

    //Page랑 똑같이 기능을 하지만, Slice는 총 몇 개의 페이지가 있는지는 알려주지 X
    //Slice<Item> findPageBy(Pageable page);
}
