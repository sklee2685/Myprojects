package 자바;

import java.util.Scanner;

public class b10871 {// X보다 작은 수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (nums[i] < X) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
