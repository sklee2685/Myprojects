package 자바;

import java.util.Scanner;

public class b2588 {//세자리 수 곱 과정

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //#1
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String numString = String.valueOf(b);

        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Character.getNumericValue(numString.charAt(i));
        }

        System.out.println(a * nums[2]);
        System.out.println(a * nums[1]);
        System.out.println(a * nums[0]);
        System.out.println(a * b);

        ////#2
        //int a = scanner.nextInt();
        //
        ////nextInt()는 정수를 입력받지만, 줄 바꿈 문자를 처리하지 않기 때문에 해당 문자가 b로 들어갈 위험이 있음
        ////따라서 아래 코드로 인해 방지
        //scanner.nextLine();
        //
        //String b = scanner.nextLine();
        //
        //System.out.println(a * (b.charAt(2) -'0' ));
        //System.out.println(a * (b.charAt(1) -'0' ));
        //System.out.println(a * (b.charAt(0) -'0' ));
        //System.out.println(a * Integer.parseInt(b));

    }
}
