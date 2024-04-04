package method;

public class MethodValue2 {//매서드 호출과 값 전달2
    /*
    호출자의 변수 이름과 매개변수의 이름을 같게해도 결과는 이전 코드랑 동일
    -> main()의 number와 chageNumber의 number는 서로 다른 변수
     */
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);//5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);//5

    }

    public static void changeNumber(int number) {
        System.out.println("2. chanageNumber 변경 전, number: " + number);//5
        number = number * 2;
        System.out.println("3. chanageNumber 변경 후, number: " + number);//10

    }
}
