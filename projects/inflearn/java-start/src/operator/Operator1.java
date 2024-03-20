package operator;

public class Operator1 {// 산술 연산자
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a + b = "+ sum); //출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = "+multi);

        //나눗셈
        int div = a/b;
        System.out.println("a / b = "+ div);// int형끼리 계산하면 결과도 int형을 사용한다. 따라서 결과값으로 소수점 이하를 포함할 수 없다.

        // 나머지
        int mod = a % b;
        System.out.println("a % b = "+ mod);

    }
}
