package variable;// variable이라는 패키지를 만들었다면 해당 패키지에 들어가는 자바 첫줄에 package variable;와 같이 소속된 패키지를 선언해 줘야 함

public class Var1 {
    public static void main(String[] args) {
        // 변수 사용X 사용 -> 총 3번의 코드를 수정
        System.out.println(20);// 변경 10->20
        System.out.println(20);// 변경 10->20
        System.out.println(20);// 변경 10->20
    }
}
