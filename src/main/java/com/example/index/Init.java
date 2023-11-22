package com.example.index;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Init {

    private final MemberService memberService;

    @PostConstruct
    public void saveMember() {
        for (int i = 0; i < 200000; i++) {
            memberService.save("회원" + i);
        }
    }
}
