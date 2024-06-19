package loop;

public class Break2 {
    public static void main(String[] args) {
        //1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가? for_1 ver

        int sum = 0;
        int i = 1;

        for (; ; ) {//조건이 없기 때문에 break문을 만나지 전까지 무한 반복
            sum += i;
            if (sum > 10){
                System.out.println("i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
