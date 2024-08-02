package exception.ex2;


public class NetworkServiceV2_4 { //예외처리 사용
    //문제점: 중간에 다른예외가 발생했다고 가정했을때,
    // 해당 예외를 잡지 못해 `client.disconnect()`가 호출되지 못함
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect();
    }
}
