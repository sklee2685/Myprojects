package exception.basic.checked;

public class CheckedCatchMain {//체크 예외를 잡아서 처리하기
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
