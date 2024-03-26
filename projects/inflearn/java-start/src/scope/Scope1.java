package scope;//scope=범위

public class Scope1 {//지역변수1(특정 지역에서만 사용가능한 변수)= 변수가 선언된 코드{} 블록
    public static void main(String[] args) {
        int m = 10; // m이라는 변수 서언
        if (true) {
            int x = 20;// if문 안에서 변수 x선언
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }// 변수 x 사용 가능한 범위
        //System.out.println("main x = " + x);//지역변수를 벗어나 변수x는 사용 못함
        System.out.println("main m = " + m);
    }// 변수 m 사용 가능한 범위
}
