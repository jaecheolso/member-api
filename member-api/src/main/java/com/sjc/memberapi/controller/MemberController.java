package com.sjc.memberapi.controller;

import com.sjc.memberapi.dto.GetMemberInfoDto;
import com.sjc.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/Member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/getMemberInfo")
    public GetMemberInfoDto getMemberInfo(String userId) {
        //필수값 체크
        if (StringUtils.isEmpty(userId)) {
            throw new IllegalArgumentException("userId is empty");
        }

        return this.memberService.getMemberInfo(userId);
    }
}
