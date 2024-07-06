package com.sjc.memberapi.controller;

import com.sjc.memberapi.controller.dto.MemberDto;
import com.sjc.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/Member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/setMemberInfo")
    public MemberDto.SetMemberInfoResponse setMemberInfo(@RequestBody MemberDto.SetMemberInfoRequest request) {
        return this.memberService.setMemberInfo(request);
    }

    @PostMapping("/getMemberInfo")
    public MemberDto.GetMemberInfoResponse getMemberInfo(@RequestBody MemberDto.GetMemberInfoRequest request) {
        return this.memberService.getMemberInfo(request);
    }
}
