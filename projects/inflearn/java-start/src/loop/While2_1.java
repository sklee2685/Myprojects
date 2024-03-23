package loop;

public class While2_1 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더하기 반복문 사용x
        int sum = 0;

        sum += 1; // sum = sum + 1
        System.out.println("i="+ 1 +" sum = "+sum);
        sum += 2;
        System.out.println("i="+ 2 +" sum = "+sum);
        sum += 3;
        System.out.println("i="+ 3 +" sum = "+sum);
    }
}
