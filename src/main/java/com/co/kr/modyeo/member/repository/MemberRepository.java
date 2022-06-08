package com.co.kr.modyeo.member.repository;

import com.co.kr.modyeo.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByUserId(String userId);
}
