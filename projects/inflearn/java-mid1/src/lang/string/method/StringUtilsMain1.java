package lang.string.method;

public class StringUtilsMain1 {//기타 유틸리티1

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드 => 다양한 타입을 문자열로 변환
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        // 문자 + x -> 문자
        String numString2 = "" + num; //문자 + 숫자 -> 문자
        System.out.println("빈 문자열 + num: " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
