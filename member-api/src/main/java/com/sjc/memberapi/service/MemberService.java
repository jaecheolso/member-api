package com.sjc.memberapi.service;

import com.sjc.memberapi.controller.dto.MemberDto;
import com.sjc.memberapi.entity.MemberEntity;
import com.sjc.memberapi.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberDto.SetMemberInfoResponse setMemberInfo(MemberDto.SetMemberInfoRequest request) {
        MemberDto.SetMemberInfoResponse setMemberInfoResponse = new MemberDto.SetMemberInfoResponse();

        MemberEntity memberEntity = MemberEntity.builder()
                    .userId(request.getUserId())
                    .userName(request.getUserName())
                    .passWord(request.getPassWord())
                    .build();

        memberRepository.save(memberEntity);
        setMemberInfoResponse.setIdx(memberEntity.getIdx());
        return setMemberInfoResponse;
    }

    @Transactional
    public ResponseEntity<MemberDto.UpdateMemberInfoResponse> updateMemberInfo(MemberDto.UpdateMemberInfoRequest request) {
        return ResponseEntity.ok().body(new MemberDto.UpdateMemberInfoResponse());
    }

    public MemberDto.GetMemberInfoResponse getMemberInfo(String userId) {
        MemberDto.GetMemberInfoResponse getMemberInfoResponse = new MemberDto.GetMemberInfoResponse();

        MemberEntity memberEntity = memberRepository.findByUserId(userId);
        getMemberInfoResponse.setUserId(memberEntity.getUserId());
        getMemberInfoResponse.setUserName(memberEntity.getUserName());
        getMemberInfoResponse.setRegDate(memberEntity.getRegDate());
        getMemberInfoResponse.setRegDate(memberEntity.getModDate());

        return getMemberInfoResponse;
    }
}
