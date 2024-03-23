package loop;

public class While2_2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더하기 반복문 사용x
        int sum = 0;
        int i =1;

        sum += i; // sum = sum + 1
        System.out.println("i="+ i +" sum = "+sum);
        i++;

        sum += i; // sum = sum + 1
        System.out.println("i="+ i +" sum = "+sum);
        i++;

        sum += i; // sum = sum + 1
        System.out.println("i="+ i +" sum = "+sum);
    }
}
