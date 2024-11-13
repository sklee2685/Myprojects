package com.example.shop.comment;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; //작성자
    @Column(length = 1000)//댓글 최대글자 수
    private String content;// 댓글 내용
    private Long parentId; //어느 게시글에 작성했는지
}
