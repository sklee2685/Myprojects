package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "lee");
        member.print();
        member.changeData("myId2", "kim");// id는 변경x
        member.print();
    }
}
