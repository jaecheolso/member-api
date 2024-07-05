package com.sjc.memberapi.controller;

import com.sjc.memberapi.controller.dto.MemberDto;
import com.sjc.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/Member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/getMemberInfo")
    public MemberDto.GetMemberInfoResponse getMemberInfo(@RequestBody MemberDto.GetMemberInfoRequest request) {
        return this.memberService.getMemberInfo(request);
    }
}
