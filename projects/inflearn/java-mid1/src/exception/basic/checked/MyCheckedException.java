package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        //어떤 사유로 에러가 발생했는지 알려줌
        super(message);
    }
}
