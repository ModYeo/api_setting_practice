package com.co.kr.modyeo.member.domain.dto;

import com.co.kr.modyeo.member.domain.entity.Member;
import lombok.Getter;

@Getter
public class MemberForm {
    private String userId;
    private String password;
    private String username;

    public Member toEntity(){
        return Member.of()
                .userId(userId)
                .username(username)
                .password(password)
                .build();
    }
}
