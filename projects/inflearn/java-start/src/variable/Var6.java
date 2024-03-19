package variable;

public class Var6 {//변수 초기화 필요성
    public static void main(String[] args) {
        int a;
        //System.out.println(a);// 주석 제거하면 컴파일 에러 발생(자바 문법에 맞지 않을때 발생하는 에러)

        //변수가 만들어진 공간이 이전에 다른 메모리가 있던 공간일 수도 있어서, 선언하지 않고 사용하면 이상한 값이 초기화될 수 있다.
        // 그래서 자바에서 변수를 초기화 하도록 강제한다.
    }
}
