import java.util.Scanner;

public class b27866 {
    // 단어 S와 정수 i가 주어졌을때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
    //첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
    //둘째 줄에 정수 i 가 주어진다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //단어 S
        String word = scanner.nextLine();

        //정수 i
        int num = scanner.nextInt()-1;

        System.out.println(word.charAt(num));
    }
}
