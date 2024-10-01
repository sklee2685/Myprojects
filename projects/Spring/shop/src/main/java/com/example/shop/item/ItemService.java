package com.example.shop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {//데이터 전송 전에 이거저거 처리해주는 비즈니스 로직

    private final ItemRepository itemRepository;

    public void saveItem(String title, Integer price) {//서버에서 db로 데이터 입출력
        Item items = new Item();
        items.setTitle(title);
        items.setPrice(price);
        itemRepository.save(items);
    }
    //서버에서 db로 데이터 전송 (위에 코드는 아래 코드를 자세히)
    //@PostMapping("/itemAdd")
    //String addPost(@ModelAttribute Item items) {
    //    itemRepository.save(items);
    //    return "redirect:/list";
    //}

    public void dbList(){//item 테이블의 데이터 꺼내기
        List<Item> date = itemRepository.findAll();//테이블의 데이터를 모두 가져옴
        System.out.println(date);
        System.out.println(date.get(0).getTitle()); // 1번째 행의 title
        System.out.println(date.get(0).getPrice()); // 1번째 행의 price
    }

    public boolean findId(Long id, Model model) {
        Optional<Item> byId = itemRepository.findById(id);
        if (byId.isPresent()) {//전달 받은 id값을 기반으로 데이터가 있는지 검사
            model.addAttribute("id", byId.get());
            //byId.get() == itemRepository.findById(id).orElse(null)
            return true;
        } else {
            System.out.println("오류 찾는 데이터가 없습니다.");
            return false;
        }
    }

    //기존 내용 수정w
    public void editDB(String title, Integer price, Long id) {
        Item item = new Item();
        item.setId(id);
        if (title.length() <= 100) {
            item.setTitle(title);
        }else{
            System.out.println("제품명이 너무 깁니다.");
            return;
        }
        if (price > 0) {
            item.setPrice(price);
        }else {
            System.out.println("양수의 값을 입력해 주세요.");
            return;
        }
        itemRepository.save(item);
    }

}
