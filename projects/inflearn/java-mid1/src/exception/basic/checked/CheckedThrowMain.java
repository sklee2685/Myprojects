package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {//예외를 처리 하지 않고 던지기
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
