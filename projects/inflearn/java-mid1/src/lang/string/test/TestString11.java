package lang.string.test;

public class TestString11 {
    /*
    str` 문자열을 반대로 뒤집어라.
    `StringBuilder` 에 있는 `reverse()` 를 사용해라.
     */
    public static void main(String[] args) {
        String str = "Hello Java";

        String reverseStr = new StringBuilder(str).reverse().toString();

        System.out.println(reverseStr);
    }
}
