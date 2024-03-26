package scope;

public class Scope2 {// 지역변수2
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);// 블록 내부에서 외부에 있는 변수인 m 접근 가능
            System.out.println("for i = " + i);
        }//변수 i의 사용 가능 범위
    }// 변수 m의 사용 가능 범위
}
