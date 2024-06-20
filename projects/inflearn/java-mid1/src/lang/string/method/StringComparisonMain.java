package lang.string.method;

public class StringComparisonMain { // 문자열 비교
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없음
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //대소문자 무시하고 비교

        //문자열을 사전 순으로 비교한다
        System.out.println("'b' compareTo 'a': " + "a".compareTo("b")); //b는 a로 부터 -1 만큼 가면 있음
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //a는 b로 부터 1 만큼 가면 있음
        System.out.println("'b' compareTo 'a': " + "c".compareTo("a")); //a는 c로 부터 2 만큼 가면 있음

        // 두 문자열을 비교해 처음으로 다른 문자열의 문자를 사전 순으로 비교
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));//W는 J로 부터 -13 만큼 가면 있음

        // 대소문자 무시하고 비교
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // 동일하므로 0

        // 문자열 시작과 끝
        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello")); // str1이 'Hello'로 시작하는지
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!")); // str1이 'Java!'로 끝나는지

        //문자열 검색

    }
}
