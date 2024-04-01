package method;

public class Method1Ref {//메소드 선언
    /*
    public static int add(int a ,int b){
        메서드 본문, 실행 코드
    }

    제어자 반환타입 메서드이름(매개변수 목록){
        메서드 본문
    }
     */

    public static void main(String[] args) {
        //계산 1
        int sum1 = add(5, 10);// 인수or인자or아규먼트 =5,10
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    public static int add(int a, int b) {//메소드(함수) 선언 매개변수or파라미터 = int a,int b
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
