package lang.wrapper;
/*
특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼 클래스라 한다.
 */
public class MyInteger { // 직접 만든 래퍼 클래스
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        //숫자를 문자로 변경
        return String.valueOf(value);
    }
}
