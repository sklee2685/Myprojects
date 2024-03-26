package casting;

public class Casting4 {//형변환4-계산과 형변환
    /*
    자바에서 계산은 다음 2가지를 기억하자.
    1. 가트은 타입끼리 계싼은 같은 타입을 결과를 낸다.
    int + int = int
    double + double = double
    2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
    int + long => long + long (자동 형변환)
    int + double => double + double (자동 형변환)
     */
    public static void main(String[] args) {
        int div1 = 3 / 2; //  int / int
        System.out.println("div1 = " + div1);//1=>int

        double div2 = 3 / 2;// int / int => double에 대입해야 함 => 자동 형변환
        System.out.println("div2 = " + div2);//1.0=> double로 자동 형변환

        double div3 = 3.0 / 2;// double / int이므로 double / double로 형변환
        System.out.println("div3 = " + div3);//1.5=> double

        double div4 = (double) 3 / 2;// 명시적 형변환으로 3을 double로 변환해 3.0 / 2이 되어 위랑 동일
        System.out.println("div4 = " + div4);//1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;// 변수로 따로 선언해서 사용해도 동일
        System.out.println("result = " + result);//1.5
    }
}
