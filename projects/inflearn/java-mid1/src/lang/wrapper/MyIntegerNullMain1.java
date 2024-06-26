package lang.wrapper;

public class MyIntegerNullMain1 { // 기본형과 null
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1),new MyInteger(2),new MyInteger(3)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    //배열에 찾는 값이 있으면 해당 값을 반환하고, 찾는 값이 없으면 `null` 을 반환
    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
