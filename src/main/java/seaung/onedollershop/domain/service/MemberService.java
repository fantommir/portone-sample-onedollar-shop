package seaung.onedollershop.domain.service;

import seaung.onedollershop.domain.entity.Member;
import seaung.onedollershop.web.request.MemberRequest;

public interface MemberService {
    Member autoRegister(); // 자동 회원 가입
}
