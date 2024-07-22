package hello.core.member;

public class MemberServiceImpl implements MemberService{ //구현체 => 회원 서비스( 회원 가입 및, 회원 조회)

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // MemoryMemberRepository에서 저장한 데이터를 불러옴

    @Override
    public void register(Member member) {
        memberRepository.save(member); //MemoryMemberRepository에 있는 save 호출
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);// MemoryMemberRepository에 있는 findMember 호출
    }
}
