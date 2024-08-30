package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {//회원 관리 저장소
    /**
     * **문제 설명**
     * `Map` 을 사용해서 회원을 저장하고 관리하는 `MemberRepository` 코드를 완성하자.
     * `Member` , `MemberRepositoryMain` 코드와 실행 결과를 참고하자.
     *
     * 실행 결과
     * ```
     * findMember1 = Member{id='id1', name='회원1'}
     * findMember3 = Member{id='id3', name='회원3'}
     * removedMember1 = null
     */
    private Map<String, Member> memberMap = new HashMap<>();


    public void save(Member member) {
        memberMap.put(member.getId(),member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
