package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
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
        return "redirect:/list"; //다시 "/list"요청
    }

    //게시글 목록 출력
    @GetMapping("/list")
    public String findAll(Model model) {
        //DB에서 조회한 데이터를 화면으로 가져옴 => Model 사용
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        System.out.println("boardDTOList = " + boardDTOList);
        return "list";
    }

    // 게시글 조회
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        //조회수 카운트
        boardService.updateHits(id);

        //상세내용
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        System.out.println("boardDTO = " + boardDTO);
        return "detail";
    }

    //게시글 수정 요청
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        return "update";
    }

    //게시글 수정 요청 수락
    @PostMapping("/update/{id}")
    public String update(BoardDTO boardDTO, Model model) {
        boardService.update(boardDTO);
        BoardDTO dto = boardService.findById(boardDTO.getId());
        model.addAttribute("board", dto);
        return "detail";
    }
}
