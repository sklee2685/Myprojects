package com.example.shop.item;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Item {//데이터베이스 테이블의 컬럼 만들기
    /*
    * @Id => primary key 설정
    * @GeneratedValue(strategy = GenerationType.IDENTITY) => auto increment 설정
    * 자동으로 1씩 올라감
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column()을 통해 컬럼에 제약설정 가능 중복방지, 필수 입력(데이터가 비어있을 경우 저장을 막아줌) 등
    @Column(nullable = false)// 필수 입력
    private String title;
    private Integer price;
    private String addUser;
}
