package exception.ex1;

public class NetworkServiceV1_2 { //예외처리 사용x - 반환값으로 예외처리
    //문제점: 네트워크 연결 해제가 되지x
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("Success");
    }
}
