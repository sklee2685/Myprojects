package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect(){

        //연결 실패
        if (connectError) {
            throw new ConnectExceptionV4(address,address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        //전송 실패
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버 데이터 전송 실패: " + data);
            //중간에 다른예외가 발생했다고 가정
            //throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address + " 서버 데이터 전송: " + data);
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

    @Override
    public void close()  {
        System.out.println("NetworkCluentV5.close");
        disconnect();
    }
}
