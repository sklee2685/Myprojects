package com.example.shop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@Controller
@RequiredArgsConstructor //Lombok 문법
public class ItemController { //상품목록 페이지

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
    String addPost(@RequestParam String title, @RequestParam Integer price, Authentication auth) {
        itemService.saveItem(title, price, auth);
        return "redirect:/list/page/1";
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
    String edit(@PathVariable Long id, Model model) {
        itemService.findId(id, model);
        return "edit.html";
    }

    //기존에 있던 내용을 수정
    @PostMapping("/edit")
    String editItem(String title, Integer price, Long id) {
        itemService.editDB(title, price, id);
        return "redirect:/list/page/1";
    }

    //내용 삭제
    @DeleteMapping("/delete")
    ResponseEntity<String> deleteItem(@RequestParam Long id) {
        itemRepository.deleteById(id);
        return ResponseEntity.status(200).body("삭제완료");
    }

    //페이지 나누기 (1~5번글 보여주기)
    @GetMapping("/list/page/{page}")
    String getListPage(Model model,@PathVariable Integer page) {
        //PageRequest.of(몇번째 페이지, 페이지방 보여줄 갯수)
        //{page}값에 따라 게시글을 5개씩 가지고 오기
        Page<Item> result = itemRepository.findPageBy(PageRequest.of(page - 1, 5));
        int totalPages = result.getTotalPages(); //총 페이지 수
        model.addAttribute("items", result);
        model.addAttribute("totalPages", totalPages);
        return "list.html";
    }
}