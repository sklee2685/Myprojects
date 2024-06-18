package lang.string;

public class StringConcatMain {
    /*
    String 클래스는 참조형으로 연산자를 사용할 수 없음
    (=> 참조값을 더하거나 뺄수는 없음)
    단, 문자열을 자주 다루어지기 때문에 자바 언어에서 편의상 +연산을 제공
     */
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a+b; // a.concat(b);와 동일하게 작동함

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
