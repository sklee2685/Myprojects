package casting;

public class Casting2 {// 형변환2- 명시적 형변환
    /*
    큰 범위에서 작은 범위로 대입
    큰 범위에서 작은 범위 대입은 명시적 형변환이 필요하다.
     */
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue;// 의도적으로 형변환을 함 => 명시적 형변환
        // 숫자가 손실되므로써 매우 큰 버그를 유발할 수 있다.
        System.out.println("intValue = " + intValue);// 1.5 -> 1
    }
}
