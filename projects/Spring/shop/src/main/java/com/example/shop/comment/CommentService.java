package com.example.shop.comment;

import com.example.shop.member.CustomUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    //댓글,작성자,게시글 id 저장
    public void save(String content,Authentication auth,Long parentId) {
        CustomUser user = (CustomUser) auth.getPrincipal();
        var data = new Comment();
        data.setUsername(user.displayName);
        data.setContent(content);
        data.setParentId(parentId);
        commentRepository.save(data);
    }
}
