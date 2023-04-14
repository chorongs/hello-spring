package hello.hellospring.service;

import hello.hellospring.repositroy.MemberRepository;
import hello.hellospring.repositroy.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}

// 빈을 직접 주입해주는 방식