package lang.string.test;

public class TestString6 {
    /*
    `str` 에서 `key` 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
    `indexOf()` 를 반복문과 함께 풀면 된다.
     */
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int index = str.indexOf(key);

        //주어진 문자를 처음에 찾고 인덱스를 1늘려줌으로써 다음에 있는 문자를 찾을 수 있게함
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);

    }
}
