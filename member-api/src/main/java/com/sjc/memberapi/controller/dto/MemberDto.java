package com.sjc.memberapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
public class MemberDto {

    @Data
    public static class SetMemberInfoRequest {
        private String userId;
        private String userName;
        private String passWord;
    }

    @Data
    public static class SetMemberInfoResponse {
        private long idx;
    }

    @Data
    public static class UpdateMemberInfoRequest {
        private long idx;
        private String userId;
        private String userName;
        private String passWord;
    }

    @Data
    public static class UpdateMemberInfoResponse {
        private String result;
    }

    @Data
    public static class GetMemberInfoRequest {
        private String userId;
    }

    @Data
    public static class GetMemberInfoResponse {
        private String userId;
        private String userName;
        private LocalDateTime regDate;
        private LocalDateTime modDate;
    }
}
