package loop;

public class For2 {// for문이 while문에 비해 구조적으로 좀 더 깔끔하게 만들 수 있다.
    public static void main(String[] args) {
        //i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 for ver

        int sum = 0;
        int endNum = 10;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
