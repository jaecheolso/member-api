package com.sjc.memberapi.controller;

import com.sjc.memberapi.controller.dto.MemberDto;
import com.sjc.memberapi.service.MemberService;
import com.sjc.memberapi.util.ValidationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/Member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/setMemberInfo")
    public MemberDto.SetMemberInfoResponse setMemberInfo(@RequestBody MemberDto.SetMemberInfoRequest request) {
        return this.memberService.setMemberInfo(request);
    }

    @PutMapping("/updateMemeberInfo")
    public ResponseEntity<MemberDto.UpdateMemberInfoResponse> updateMemberInfo(@RequestBody MemberDto.UpdateMemberInfoRequest request) {
        ValidationUtil validationUtil = new ValidationUtil();
        if (!validationUtil.updateValidationCheck(request.getUserId())) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(this.memberService.updateMemberInfo(request).getBody());
    }

    @GetMapping("/getMemberInfo/{userId}")
    public MemberDto.GetMemberInfoResponse getMemberInfo(@PathVariable("userId") String userId) {
        return this.memberService.getMemberInfo(userId);
    }
}
