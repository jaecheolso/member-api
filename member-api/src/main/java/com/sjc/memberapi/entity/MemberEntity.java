package com.sjc.memberapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private String userId;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "passWord", nullable = false)
    private String passWord;

    @Column(name = "regDate")
    private LocalDateTime regDate;

    @Column(name = "modDate")
    private LocalDateTime modDate;
}
