package org.example.nullablesample.member;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Slf4j
@NullMarked
//nullMarked 모든 argument 나 return은 null 이 아님.
public class MemberService {


    //null 이 들어오면 안되는데 null을 호출하는 값이 있어 warning
    public void createMember(MemberRegisterRequest registerRequest) {
        log.info("registerRequest: {}", registerRequest);
    }

    // null 이 아님을 알기 때문에 null 체크 시 warning 발생.
    public String getMemberName(String test) {
        return test != null ? test.toUpperCase() + "-hi" : "";
    }

    public @Nullable String getMemberName2(@Nullable String test) {
        return test != null ? test : "";
    }
}
