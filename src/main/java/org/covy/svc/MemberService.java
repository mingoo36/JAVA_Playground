package org.covy.svc;

import org.covy.repository.MemberRepository;
import org.covy.svc.dto.MemberRequestDto;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    // 생성자를 통한 의존성 주입(DI)
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(MemberRequestDto request) {
        // 비즈니스 로직 구현
        Member member = new Member(request.getName(), request.getEmail());
        memberRepository.save(member);
    }
}
