package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {// 리팩토리 후
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice);
        hello(sum);

        // 조금더 줄이면 다음과 같이 사용 가능
        //hello(new Dice());
        //hello(new Sum());
    }
}
