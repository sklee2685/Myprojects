package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

        model.addAttribute("items", itemRepository.findAll());
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

    //서버에서 db로 데이터 전송 (위에 코드는 아래 코드를 자세히)
    @PostMapping("/itemAdd")
    String addPost(@ModelAttribute Item items) {
        itemRepository.save(items);
        return "redirect:/list";
    }

    //상품 상세페이지 만들기
    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id,Model model) {
        Optional<Item> byId = itemRepository.findById(id);
        if (byId.isPresent()) {//전달 받은 id값을 기반으로 데이터가 있는지 검사
            model.addAttribute("id", itemRepository.findById(id).orElse(null));
            return "detail.html";
        }else{
            System.out.println("오류 찾는 데이터가 없습니다.");
            return "redirect:/list";
        }
    }
}