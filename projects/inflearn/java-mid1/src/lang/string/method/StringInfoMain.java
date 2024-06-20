package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {//문자열 정보 조회
        String str1 = "Hello, Java!";
        String str2 = "";

        System.out.println("문자열의 길이: " + str1.length());
        System.out.println("문자열이 비어 있는지: " + str1.isEmpty());
        System.out.println("문자열이 비어 있는지: " + str2.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지: " + str1.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지: " + "        ".isBlank());

        char c = str1.charAt(7);
        System.out.println("7번 인덱스의 문자 = " + c);
    }
}
