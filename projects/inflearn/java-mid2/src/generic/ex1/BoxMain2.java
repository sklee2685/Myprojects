package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        //Object object = objectBox.get();
        //Integer integer = (Integer) object;

        // 위 코드랑 동일
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        /**
         * 문제점
         * 반환 타입이 맞지 않는 문제 발생
         * => 코드 재사용은 늘어났지만 그 만큼 타입 안전성이 떨어짐
         */
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생
        System.out.println("result = " + result);
    }
}
