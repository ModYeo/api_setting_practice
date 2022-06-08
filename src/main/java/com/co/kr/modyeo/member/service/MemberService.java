package com.co.kr.modyeo.member.service;

import com.co.kr.modyeo.member.domain.dto.MemberForm;
import com.co.kr.modyeo.member.domain.entity.Member;

public interface MemberService {
    Member saveMember(MemberForm memberForm);
}
