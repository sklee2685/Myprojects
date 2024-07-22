package hello.core.member;

public interface MemberRepository {
    //회원 저장
    void save(Member member);

    //회원 id로 회원을 찾음
    Member findById(Long memberId);
}
