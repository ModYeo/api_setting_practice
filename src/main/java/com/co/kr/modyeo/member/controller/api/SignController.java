package com.co.kr.modyeo.member.controller.api;

import com.co.kr.modyeo.authentication.provider.JwtTokenProvider;
import com.co.kr.modyeo.authentication.service.CustomUserDetailsService;
import com.co.kr.modyeo.common.result.JsonResultData;
import com.co.kr.modyeo.member.domain.dto.MemberForm;
import com.co.kr.modyeo.member.domain.entity.Member;
import com.co.kr.modyeo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequiredArgsConstructor
public class SignController {
    private final CustomUserDetailsService customUserDetailsService;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final MemberService memberService;

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody MemberForm memberForm){
        Member member = memberService.saveMember(memberForm);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(JsonResultData
                        .successResultBuilder()
                        .data(null)
                        .build());
    }

}
