package com.sjc.memberapi.service;

import com.sjc.memberapi.controller.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    public MemberDto.GetMemberInfoResponse getMemberInfo(MemberDto.GetMemberInfoRequest request) {
        MemberDto.GetMemberInfoResponse getMemberInfoResponse = new MemberDto.GetMemberInfoResponse();
        getMemberInfoResponse.setUserId(request.getUserId());
        return getMemberInfoResponse;
    }
}
