package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor //Lombok 문법
public class ItemListController { //상품목록 페이지

    //ItemRepository 사용하기
    private final ItemRepository itemRepository;

    //Lombok 없이 사용
    //@Autowired
    //public ItemListController(ItemRepository itemRepository) {
    //    this.itemRepository = itemRepository;
    //}

    @GetMapping("/list")
    String list(Model model) {
        //item 테이블의 데이터 꺼내기
        List<Item> date = itemRepository.findAll();//테이블의 데이터를 모두 가져옴
        System.out.println(date);
        System.out.println(date.get(0).title); // 1번째 행의 title
        System.out.println(date.get(0).price); // 1번째 행의 price

        model.addAttribute("name","lee jung ho");
        return "list.html";
    }
}
