package method;

public class Method2 {//매개변수가 없거나 반환 타입이 없는 경우

    public static void main(String[] args) {
        printHeader();
        printFooter();
    }
    public static void printHeader(){
        System.out.println("=프로그램을 시작합니다=");
        return;
    }

    public  static  void printFooter(){
        System.out.println("=프로그램을 종료합니다=");

    }
    /*
    매개변수가 없는 경우
    선언: public  static  void printFooter()와 같이 매개변수를 비워두고 정의
    호출: printHeader();와 같이 인수를 비워두고 호출

    반환 타입이 없는 경우
    선언: public  static  void printFooter()와 같이 반환 타입을 void로 정의
    호출: printHeader();와 같이 반환 타입이 없으므로 매서드만 호출하고 반환 값을 박지 않으면 됨
    ex) String str = printHeader(); 반환 타입이 void이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생
     */

}
