package com.holly.molly.service;

import com.holly.molly.domain.Member;
import com.holly.molly.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest//실제 스프린 컨테이너와 테스르를 실행한다.
@Transactional//트랜젝션을 먼저 실행한 후, DB 롤백을 통해 복구해준다. ->다음 테스트를 실행할 수 있다.
public class MemberServiceIntegrationTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        //given
        Member member=new Member();
        member.setName("tet");
        member.setEmailAddress("test@gmail.com");
        member.setPassword("1234");

        //when
        Long saveId=memberService.register(member);

        //then
        Member findMember=memberRepository.findById(saveId).get();
        assertEquals(member.getEmailAddress(), findMember.getEmailAddress());
    }

    @Test
    public void 중복_회원_예외(){
        //given
        Member member1=new Member();
        member1.setName("tet");
        member1.setEmailAddress("test1@gmail.com");
        member1.setPassword("1234");

        Member member2=new Member();
        member2.setName("tet");
        member2.setEmailAddress("test1@gmail.com");
        member2.setPassword("1234");

        //when
        memberService.register(member1);
        IllegalStateException e=assertThrows(IllegalStateException.class, ()->memberService.register(member2));//예외가 터져야한다는 단정
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        //then
    }

}