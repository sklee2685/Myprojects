package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        System.out.println(date.get(0).getTitle()); // 1번째 행의 title
        System.out.println(date.get(0).getPrice()); // 1번째 행의 price

        model.addAttribute("items",itemRepository.findAll());
        return "list.html";
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

    //@PostMapping("/itemAdd")
    //String addPost(@RequestParam String title, @RequestParam Integer price) {
    //    Item items = new Item();
    //    items.setTitle(title);
    //    items.setPrice(price);
    //    itemRepository.save(items);
    //    return "redirect:/list";
    //}

    @PostMapping("/itemAdd")
    String addPost(@ModelAttribute Item items) {
        itemRepository.save(items);
        return "redirect:/list";
    }
}