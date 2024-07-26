package 자바;

import java.util.Scanner;

public class b10807 {// 배열에서 특정 값 개수 세기

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            int n = scanner.nextInt();
            nums[i] = n;
        }

        int count = 0;
        int findNum = scanner.nextInt();

        for (int num : nums) {
            if (num == findNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
