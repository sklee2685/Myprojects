package scope;

public class Scope3_1 {//접근 범위(스코프)의 존재 이유1
    /*1. 비효율적인 메모리 사용
    ->if문에서만 사용하는 변수 temp가 메인에 선언됨으로써 메인 코드블록이 종료될 때 까지 메모리에 유지가됨
    -> **메모리 낭비**

     2. 코드 복잡성 증가
     -> 변수가 if문안에 있으면 if문이 끝나는 순간 변수 temp를 따로 신경쓰지 않아도 됨
     -> but 메인에 변수가 선언되면 지속적으로 해당 변수를 생각하고있어야 하고, 나중에 유지보수 할 떄 까지 계속 신경써야 함
     -> **접근 범위(스코프)가 불필요하게 넓다.**
    */
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
