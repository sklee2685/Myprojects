package method;

public class MethodCasting2 {//메서드와 형변환2 - 자동 형변환
    /*
    int<long<double
    변수에서 자동 형변환을 했던거 처럼 메서드에서도 동일하게 작용한다.
     */
    public static void main(String[] args) {
        int num = 100;
        printNum(num);
    }

    public static void printNum(double n) {
        System.out.println("숫자= " + n);
    }
}
