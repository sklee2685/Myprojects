package 자바;

import java.util.Scanner;

public class b2562 {//최대값 및 해당 인덱스 번호
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[9];
        int max = 0;
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > max) {
                max = nums[i];
                num = i+1;
            }
        }
        System.out.println(max);
        System.out.print(num);
    }
}
