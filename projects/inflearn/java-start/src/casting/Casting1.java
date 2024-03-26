package casting;

public class Casting1 {// 형변환1-자동 형변환
    /*
    작은 범위에서 큰 범위로 대입은 허용한다.
    int<long<double

    아래 예제 처럼 형이 변경되는 것을 형변환이라고 하는데,
    작은 범위 숫자 타입에서 큰 범위 숫자 타입으로 대입은 개발자가 직접 형변환을 하지 않아도 된다.
    이런 과정이 자동으로 일어나기 때문에 **자동 형변환**, 또는 **묵시적 형변환**이라 한다.
    */
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;//int -> long
        //본래라면 longValue = (long) intValue; 으로 입력 해야함
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;//int -> double
        //doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;//long->double
        //doubleValue = (double) 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
