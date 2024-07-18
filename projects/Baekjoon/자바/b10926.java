package 자바;

import java.util.Scanner;

public class b10926 {
    /*
    준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
    준하는 놀람을 ??!로 표현한다.
    준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때,놀람을 표현하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.nextLine();

        System.out.println(id+"??!");

        ////숏코딩
        //System.out.println(new Scanner(System.in).next()+"??!");
        /*
        next() 메서드는 입력된 문자열 중 첫 번째 단어를 읽어온다. 따라서 Scanner객체에서 받아온
        데이터를 읽어온 다음 "??!"를 추가한다.
         */
    }
}
