package 자바;

import java.util.Arrays;
import java.util.Scanner;

public class b10818 {// 최대 최소

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] num = new int[N];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        //오름차순 정렬
        Arrays.sort(num);
        //정렬로 인해 배열 가장 처음은 최소, 맨 마지막은 최대값으로 정렬됨
        System.out.println(num[0] + " " + num[N - 1]);
    }
}
