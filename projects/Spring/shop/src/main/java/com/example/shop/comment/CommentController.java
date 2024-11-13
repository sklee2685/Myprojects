package com.example.shop.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    //댓글 내용,게시글id,작성자 저장
    @PostMapping("/comment")
    public String  leave(@RequestParam String content,Authentication auth,@RequestParam Long parentId) {
        commentService.save(content,auth,parentId);
        return "redirect:/list/page/1";
    }
}
