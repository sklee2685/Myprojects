package hello.core.member;

public interface MemberService {

    //회원가입
    void register(Member member);

    //회원 조회
    Member findMember(Long memberId);

}
