package construct;

public class MethodInItMain3 {//생성자-필요한 이유3
    /*
    this 사용
    (this 는 인스턴스 자신의 참조값을 가리킨다)
     */
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.InitMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member1.InitMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
