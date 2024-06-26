package lang.wrapper;

public class MyIntegerNullMain0 { // 기본형과 null
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

        /*
        문제점
        `findValue(intArr, -1)` 와 `findValue(intArr, 100)`의 출력 값이 -1로 동일
         */
    }

    //배열에 찾는 값이 있으면 해당 값을 반환하고, 찾는 값이 없으면 `-1` 을 반환
    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
