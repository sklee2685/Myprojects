package loop.ex;

public class NestedEx1 {//중첩 for문

    public static void main(String[] args) {
        /*
        중첩 for문을 사용해서 구구단을 완성해라.

        **출력 형태**
        1 * 1 = 1
        1 * 2 = 2
        ...
        9 * 9 = 81
        */

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
