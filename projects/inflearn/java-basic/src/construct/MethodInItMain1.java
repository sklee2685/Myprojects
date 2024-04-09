package construct;

public class MethodInItMain1 {//생성자-필요한 이유1
    /*
    객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(Constructor)를 이용하면 된다.
    생성자를 알아보기 전에 먼저 생성자가 왜 필요한지 코드로 간단히 알아보자.
     */
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user1";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }


    }
}
