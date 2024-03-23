package loop;

public class Break3 {
    public static void main(String[] args) {
        //1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가? for_2 ver

        int sum = 0;


        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("i = " + i + " sum = " + sum);
                break;
            }

        }
    }
}
