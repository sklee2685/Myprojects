package exception.ex1;

public class NetworkClientV1 { //예외처리 사용x - 오류 사항 만들기

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 실패
        if (connectError) {
            System.out.println(address + "서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "Success";
    }

    public String send(String data) {
        //전송 실패
        if (sendError) {
            System.out.println(address + "서버 데이터 전송 실패: " + data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address + "서버 데이터 전송: " + data);
        return "Success";

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
