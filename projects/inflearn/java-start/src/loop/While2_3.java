package loop;

public class While2_3 {
    public static void main(String[] args) {
        // i부터 하나씩 증가하는 수를 endNum(마지막 수) 까지 더해라
        int i = 1;
        int endNum = 3;
        int sum = 0;

        while(i <= endNum){
            sum += i;
            System.out.println("i="+ i +" sum = "+sum);
            i++;
        }
        System.out.println("sum = "+sum);
    }
}
