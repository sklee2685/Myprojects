package ref;

public class VarChange1 {//기본형 vs 참조형 - 기본형

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }// 실제 데이터를 복사하는 기본형으로 변수 a나 b 둘중 하나가 수정되어도 서로 영향이 없음
}
