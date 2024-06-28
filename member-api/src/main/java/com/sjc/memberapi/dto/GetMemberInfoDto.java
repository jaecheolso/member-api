package com.sjc.memberapi.dto;

import lombok.Data;

@Data
public class GetMemberInfoDto {

    private String userName;
    private String sex;
    private int age;
}
