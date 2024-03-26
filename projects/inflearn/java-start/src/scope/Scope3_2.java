package scope;

public class Scope3_2 {//Scope3_1 수정ver
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        //System.out.println("temp = " + temp);// if문에 temp가 선언되어서 메인에서는 사용 불가
        System.out.println("m = " + m);
    }
}
/*
스코프(접근 범위)정리

변수는 꼭 필요한 범위로 한정해서 사용
변수의 스코프(접근 범위)는 꼭 필요한 곳으로 한정해서 사용
-> 메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있음

**좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절하 제약이 있는 프로그램이다.**
 */