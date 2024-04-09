package construct;

public class ConstructMain1 {//생성자 도입
    /*
    생성자는 인스턴스를 생성하고 나서 즉시 호출된다. 생성자를 호출하는 방법은 다음 코드와 같이 `new` 명령어 다음에
    생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.

    new 클래스이름(생성자에 맞는 인수 목록)
     */
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
