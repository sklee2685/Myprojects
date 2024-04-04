package method;

public class MethodValue0 {//매서드 호출과 값 전달1
    /*
    ***자바는 항상 변수의 값을 복사해서 대입한다.***
    아주 중요한 대원칙 하나 밑줄 100번!!
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
