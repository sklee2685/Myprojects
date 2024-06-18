package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2)); // 참조값이 달라서 false 출력
        System.out.println("new String() equals 비교: " + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));
        /*
        문자열 풀 이라는 자원이 모여있는 곳이 있다.
        여기선 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어두고,
        같은 문자열이 있다면 다시 만들지 않는다.
        그래서 str3==str4에서 인스턴스가 참조될 때 같은 참조값을 반환한다.

        결론 => 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 `==`로 비교에 성공한다.
         */
    }
}
