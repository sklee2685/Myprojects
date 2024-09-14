package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/*
@RequiredArgsConstructor은 `final`이 붙은 필드을 인자로 받는 생성자를 자동으로 생성
ex) private final BoardService boardService; 은

public BoardController (BoardService boardService) {
    this.boardService = boardService;
}
이런식으로 생성자를 자동으로 만들어줌

*/

@Controller
@RequiredArgsConstructor
public class BoardController {
    //생성자 주입 관계
    private final BoardService boardService;

    //게시글 화면 출력
    @GetMapping("/save")
    private String save() {
        return "save";
    }

    //게시글에서 작성한 데이터 전송받음 DTO,html파일에서 입력한 변수명이 모두 일치해야함(여기서 입력한 것도 포함)
    @PostMapping("/save")
    private String save(BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }
}
