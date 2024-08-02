package exception.ex2;

public class NetworkClientExceptionV2 extends Exception { // ex1 예외처리 사용vr
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
