package com.jerry.config;

import com.jerry.member.InMemoryMemberService;
import com.jerry.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
    @Bean
    public MemberService inMemoryMemberService() {
        return new InMemoryMemberService();
    }
}
