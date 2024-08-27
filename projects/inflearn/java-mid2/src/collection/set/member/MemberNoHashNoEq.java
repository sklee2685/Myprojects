package collection.set.member;

public class MemberNoHashNoEq {
    /*
    hashCode, equals를 모두 구현하지 않은 경우
    => Object에서 제공하는 hashCode,equals를 사용함
     */

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
