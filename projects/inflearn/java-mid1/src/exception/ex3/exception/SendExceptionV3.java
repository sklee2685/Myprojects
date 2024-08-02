package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3{// 데이터 전송 실패
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
