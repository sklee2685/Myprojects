package lang.string.method;

public class StringSearchMain { // 문자열 검색
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        //문자열이 특정 문자열을 포함하고 있는지 확인
        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));

        //'Java'라는 문자열이 가장 처음 나오는 인덱스
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java"));

        //'Java'라는 문자열을 뒤에서 부터 찾음
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java"));

        // 10번째 인덱스로 부터 'Java'가 몇번째 인덱스에 있는지
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java", 10));

    }
}
