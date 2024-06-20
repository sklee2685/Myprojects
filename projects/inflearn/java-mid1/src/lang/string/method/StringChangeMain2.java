package lang.string.method;

public class StringChangeMain2 { //문자열 조작 및 변환2
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming";

        System.out.println("소문자로 변환: "+strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: "+strWithSpaces.toUpperCase());

        //문자열 양쪽 끝의 공백만 제거(Whitespace만 제거 가능)
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");
        //Whitespace 와 유니코드 공백(특수한 공백)을 포함해서 제거
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(stripLeading): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(stripTrailing): '" + strWithSpaces.stripTrailing() + "'");
    }
}
