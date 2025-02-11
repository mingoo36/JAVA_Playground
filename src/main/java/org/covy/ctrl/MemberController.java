package org.covy.ctrl;

import org.covy.svc.dto.MemberRequestDto;
import org.covy.svc.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    // 생성자를 통한 의존성 주입(DI)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/member/join")
    public String joinMember(@RequestBody MemberRequestDto request) {
        memberService.join(request);
        return "가입이 완료되었습니다";
    }
}
