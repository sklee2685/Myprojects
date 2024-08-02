package exception.ex2;

public class NetworkClientV2 { //예외처리 사용 - 오류 사항 만들기

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2{

        //연결 실패
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError",address + "서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + "서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        //전송 실패
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + "서버 데이터 전송 실패: " + data);
            //중간에 다른예외가 발생했다고 가정
            //throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address + "서버 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        //error1,error2가 포함되어있늕 확인
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
