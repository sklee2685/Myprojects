package poly.ex.sender;

public class SendMain {//다중 메시지 발송
    /*
    한번에 여러 곳에 메시지를 발송하는 프로그램

    요구 사항
    다형성을 활용하세요.
    `Sender` 인터페이스를 사용하세요.
    `EmailSender` , `SmsSender` , `FaceBookSender` 를 구현하세요.
     */
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다.");
        }
    }
}
