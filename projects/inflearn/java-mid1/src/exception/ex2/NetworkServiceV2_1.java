package exception.ex2;


public class NetworkServiceV2_1 { //예외처리 사용
    //문제점: 예외가 발생하면 발생하면 프로그램이 종료가 되고, disconnect()호출이 X
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);


        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
