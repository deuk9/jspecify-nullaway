package org.example.nullablesample.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public void createMember(@RequestBody MemberRegisterRequest request) {
        //null이면 안되기 때문에 warning 발생.
        memberService.createMember(null);
    }


    @GetMapping
    public void getMember() {
        String test = memberService.getMemberName("test");
        // null 이 아님을 알기 때문에 warning 발생.
        if (test == null) {

        }
    }

}
