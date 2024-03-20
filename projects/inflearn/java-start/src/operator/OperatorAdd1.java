package operator;

public class OperatorAdd1 {// 증감 연산자 (++ --)
    public static void main(String[] args) {
        int a =0;
         a = a + 1;
        System.out.println("a = " + a);// 결과 -> 1

        a = a + 1;
        System.out.println("a = " + a);// 결과 -> 2

        // 증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a);// 결과 -> 3

        ++a;
        System.out.println("a = " + a);// 결과 -> 4

        --a; // a = a - 1
        System.out.println("a = " + a);// 결과 -> 3
    }
}
