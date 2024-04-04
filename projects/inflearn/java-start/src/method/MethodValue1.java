package method;

public class MethodValue1 {//메서드 호출과 값 복사
    /*
    자바는 항상 값을 복사해서 전달하기 때문에 num2의 값을 바꾸더라도 num1에는 영향을 주지 않는다.
     */
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);//5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);//5

    }

    public static void changeNumber(int num2) {
        System.out.println("2. chanageNumber 변경 전, num2: " + num2);//5
        num2 = num2 * 2;
        System.out.println("3. chanageNumber 변경 후, num2: " + num2);//10

    }
}
