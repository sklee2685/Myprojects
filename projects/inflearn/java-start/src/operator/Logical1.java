package operator;

public class Logical1 {// 논리 연산자

    public static void main(String[] args) {
        System.out.println("&&: AND 연산");// &&(그리고): 두 피연산자가 모두 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");// ||(또는): 두 피연산자중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");// !(부정): 피연산자의 논리적 부정을 반환 참->거짓, 거짓->참 반환
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
