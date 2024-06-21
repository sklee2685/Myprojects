package lang.string.test;

public class TestString9 {
    //`split()` 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] part = email.split("@");
        String id = part[0];
        String domain = part[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
