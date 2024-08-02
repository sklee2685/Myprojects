package exception.ex2;


public class NetworkServiceV2_2 { //예외처리 사용
    //문제점: 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 어렵다, 에러 발생시 `disconnect()`호출이 x
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            //오류가 발생했으니 데이터를 보네는 `client.send(data)`로 넘어가면X => return을 호출해 방지
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
