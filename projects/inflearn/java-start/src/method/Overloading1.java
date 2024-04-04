package method;

public class Overloading1 {//메소드 오버로딩
    /*
    add(int a, int b)
    add(int a, int b, int c)
    add(double a, double b)
    이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 매서드 오버로딩이라 한다.
    (=같은 이름의 메서드를 여러개 정의 했다.)

    규칙
    메서드이 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다.(반환 타입은 인정하지 x)

    매서드 이름과 매개변수의 타입이 같으므로 컴파일 오류 발생(반환 타입은 인정하지x)
    int add(int a, int b)
    double add(int a, int b)
     */
    public static void main(String[] args) {//매개변수위 갯수가 다른 오버로딩 예제
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
