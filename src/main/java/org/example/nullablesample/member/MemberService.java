package org.example.nullablesample.member;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@NullMarked
//nullMarked 모든 argument 나 return은 null 이 아님.
public class MemberService {


    //null 이 들어오면 안되는데 null을 호출하는 값이 있어 warning
    public void createMember(MemberRegisterRequest registerRequest) {
        log.info("registerRequest: {}", registerRequest);
    }


    // null 이 아님을
    public String getMemberName(String test) {
        return test != null && !test.isBlank() ? test + "-hi" : "";
    }

    public String getMemberName2(@Nullable String test) {
        return test != null ? test : "";
    }
}
