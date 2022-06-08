package com.co.kr.modyeo.member.service.impl;

import com.co.kr.modyeo.member.domain.dto.MemberForm;
import com.co.kr.modyeo.member.domain.entity.Member;
import com.co.kr.modyeo.member.repository.MemberRepository;
import com.co.kr.modyeo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public Member saveMember(MemberForm memberForm) {
        return null;
    }
}
