package variable;

public class Var2 {
    public static void main(String[] args) {
        int a;//변수 a 선언
        a = 20;// 변수 초기화(선언한 변수에 처음으로 값을 대입해서 저장하는 것) 10->20

        // 변수 사용O -> a=10;에서 10을 20으로 1번 변경하는걸로 Var1파일과 동일한 결과를 만들 수 있음
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

    }
}
