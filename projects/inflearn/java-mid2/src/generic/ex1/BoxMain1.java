package generic.ex1;

public class BoxMain1 {//제네릭 필요한 이유- 제네릭 미사용

    /**
     * 문제점
     * `Double`,`Boolean`을 포함한 다양한 타입을 담는 박스가 필요하다면 각각의 타입별로
     * `DoubleBox`,`BooleanBox`와 같이 클래스를 새로 만들어야하는데,
     * 담는 타입이 수십개의 `XxxBox`클래스를 만들어야 함
     */
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
