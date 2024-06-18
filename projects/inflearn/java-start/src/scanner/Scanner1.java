package scanner;

//  java.util 패키지 안에 Scanner 클래스가 있으므로 다음과 같이 import를 쓴 후 사용
import java.util.Scanner;

public class Scanner1 {// 사용자로 부터 데이터 입력 받기
    public static void main(String[] args) {
        // Scanner클래스를 사용하기 위해 scanner이라는 객체를 생성
        Scanner scanner = new Scanner(System.in);// 사용자로부터 입력받은 값을 변수 scanner에 입력

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();// 입력한 값을 변수 str에 String타입으로 가져옴
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();// 입력한 값을 변수 intValue에 int타입으로 가져옴
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 입력한 값을 변수 doubleValue에 double타입으로 가져옴
        System.out.println("입력한 실수: " + doubleValue);
    }
}
