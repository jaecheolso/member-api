package com.sjc.memberapi.service;

import com.sjc.memberapi.dto.GetMemberInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    public GetMemberInfoDto getMemberInfo(String UserId) {
        GetMemberInfoDto getMemberInfoDto = new GetMemberInfoDto();
        getMemberInfoDto.setUserName("test");
        getMemberInfoDto.setAge(30);
        getMemberInfoDto.setSex("중성");

        return getMemberInfoDto;
    }
}
