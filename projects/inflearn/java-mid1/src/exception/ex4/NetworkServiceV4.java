package exception.ex4;

public class NetworkServiceV4 { //예외 계층 - 활용
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
