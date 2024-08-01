package exception.ex1;

public class NetworkServiceV1_1 { //예외처리 사용x - 오류 사항 만들기
    //문제점: 오류가 발생해도 계속 실행됨
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
