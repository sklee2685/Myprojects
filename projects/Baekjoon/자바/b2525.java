package 자바;

import java.util.Scanner;

public class b2525 {//오븐 시계

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //
        //int h = scanner.nextInt();
        //int m = scanner.nextInt();
        //scanner.nextLine();
        //
        //int cookTime = scanner.nextInt();
        //
        //int time_h = cookTime / 60;
        //int time_m = cookTime % 60;
        //
        //h += time_h;
        //m += time_m;
        //
        //if (m >= 60) {
        //    h += 1;
        //    m -= 60;
        //}
        //if (h >= 24) {
        //    h -= 24;
        //}
        //
        //System.out.println(h + " " + m);

        //숏코딩
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int C = scanner.nextInt();

        int min = 60 * A + B;   // A의"시"를 -> "분"으로
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
