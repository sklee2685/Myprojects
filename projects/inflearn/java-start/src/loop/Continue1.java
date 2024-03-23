package loop;

public class Continue1 {// continue
    public static void main(String[] args) {
        //1에서 5까지 출력하지만 3을 제외하고 출력
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;// 해당 코드가 실행되면 아래있는 코드는 무시하고 다시 조건문으로 돌아감
            }
            System.out.println(i);
            i++;
        }
    }
}
