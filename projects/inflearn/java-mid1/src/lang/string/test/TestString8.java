package lang.string.test;

public class TestString8 {
    //`replace()` 를 사용해서 `java` 라는 단어를 `jvm` 으로 변경해라.
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}
