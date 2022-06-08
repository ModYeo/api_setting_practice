package com.co.kr.modyeo.member.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String userId;

    private String password;

    private String username;

    @Builder(builderClassName = "of",builderMethodName = "of")
    public Member(Long id,String userId, String password, String username) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.username = username;
    }
}
