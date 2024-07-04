package com.sjc.memberapi;

import com.sjc.memberapi.entity.MemberEntity;
import com.sjc.memberapi.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MemberEntityApiApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Test
	void  selectTest() {
		Long idx = 1L;
		Optional<MemberEntity> memberEntity = memberRepository.findById(idx);
	}

	void insertTest() {
		MemberEntity memberEntity = MemberEntity.builder()
				.user_id("jaecheol")
				.user_name("소재철")
				.pass_word("jaecheol")
				.build();

		memberRepository.save(memberEntity);
	}

}
