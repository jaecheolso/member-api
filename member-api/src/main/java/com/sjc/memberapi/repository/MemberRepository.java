package com.sjc.memberapi.repository;

import com.sjc.memberapi.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByUserId(String UserId);
}
