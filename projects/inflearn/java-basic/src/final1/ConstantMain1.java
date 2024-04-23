package final1;

public class ConstantMain1 {
    /*
    문제점
    최대 참여자 수를 변경하려면 여러군데를 수정해야함
    만약 이런 수정할 곳이 100곳 이상이면 모두 변경해줘야함

    만약 코드에 최대 참여자수라는 문장이 없고 숫자만 있다면 나중에 해당 숫자가 무엇을 의미하는지 혼동이 올 수 있음

    ->여기서 해결 방법으로 상수를 사용하면 해결가능
     */
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다");
        }else{
            System.out.println("게임에 참여합니다.");
        }
    }
}
