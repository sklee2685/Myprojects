package com.example.shop;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class Announcement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    /**
     *@CreationTimestamp
     *=> 엔티티가 생성될 때 자동으로 현재 날짜와 시간dl date 필드에 저장
     *@Temporal(TemporalType.TIMESTAMP)
     *=>Date 타입을 사용하면서 날짜와 시간을 모두 저장하기 위해 사용
     * @Column(updatable = false)
     *=>한 번 생성된 이후에는 date 값이 업데이트되지 않도록 설정
     */
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date date;

    public Date getCreatedAt() {
        return date;
    }
}


