package casting;

public class Casting3 {// 형변환3-오버플로우(작은 숫자가 표현할 수있는 범위를 넘음)
    public static void main(String[] args) {
        long maxIntValue = 2147483647;//int 최고값
        long maxIntOver = 2147483648L;// int 최고값 +1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);// 출력:2147483647

        intValue = (int) maxIntOver;// 형변환
        System.out.println("maxIntOver casting = " + intValue);// 출력 -2147483648
    }
}
