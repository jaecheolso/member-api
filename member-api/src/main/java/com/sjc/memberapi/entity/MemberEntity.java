package com.sjc.memberapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false)
    private Long idx;

    @Column(name = "userId", nullable = false)
    private String user_id;

    @Column(name = "userName", nullable = false)
    private String user_name;

    @Column(name = "passWord", nullable = false)
    private String pass_word;

    @Column(name = "regDate")
    private Date reg_date;

    @Column(name = "modDate")
    private Date mod_date;
}
