package lang.wrapper.test;

public class WrapperTest1 {//parseInt()
    /*
    문자로 입력된 `str1` , `str2` 두 수의 합을 구하자.

    **실행 결과**
    두 수의 합: 30
    */
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;

        System.out.println("두 수의 합: " + sum);

    }
}
