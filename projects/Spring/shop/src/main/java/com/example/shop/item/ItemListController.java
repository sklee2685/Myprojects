package com.example.shop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor //Lombok 문법
public class ItemListController { //상품목록 페이지

    //ItemRepository 사용하기
    private final ItemRepository itemRepository;

    //ItemService 사용하기
    private final ItemService itemService;


    //Lombok 없이 사용
    //@Autowired
    //public ItemListController(ItemRepository itemRepository) {
    //    this.itemRepository = itemRepository;
    //}

    @GetMapping("/list")
    String list(Model model) {
        //item db에 있는 테이블 데이터 꺼내기
        itemService.dbList();

        model.addAttribute("items", itemRepository.findAll());
        return "list.html";
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

    @PostMapping("/itemAdd")
    String addPost(@RequestParam String title, @RequestParam Integer price) {
        itemService.saveItem(title, price);
        return "redirect:/list";
    }

    //상품 상세페이지 만들기
    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) {
        if (itemService.findId(id, model)) {//전달 받은 id값을 기반으로 데이터가 있는지 검사
            return "detail.html";
        } else {
            return "redirect:/list";
        }
    }

    //id를 기반으로 기존에 있던 데이터를 불러옴
    @GetMapping("/edit/{id}")
    String edit(@PathVariable Long id, Model model, String title, Integer price) {
        itemService.findId(id, model);
        return "edit.html";
    }

    //기존에 있던 내용을 수정
    @PostMapping("/edit")
    String editItem(String title, Integer price, Long id) {
        itemService.editDB(title, price, id);
        return "redirect:/list";
    }

}