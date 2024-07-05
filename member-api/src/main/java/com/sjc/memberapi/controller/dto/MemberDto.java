package com.sjc.memberapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class MemberDto {
    @Data
    public static class GetMemberInfoRequest {
        private String userId;
    }

    @Data
    public static class GetMemberInfoResponse {
        private String userId;
    }
}
