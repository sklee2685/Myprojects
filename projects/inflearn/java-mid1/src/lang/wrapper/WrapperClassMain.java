package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Integer은 나중에 자바에서 삭제될 예정으로, 대신에 valueOf()를 사용
        Integer newInteger = new Integer(10);

        /*
        // =-128~127 자주 사용하는 범위의 값을 `Integer`클래스에 미리 생성하고
        범위의 값을 조회하면 미리 생선된 `Integer`객체를 반환하고, 해당 범위에 없다면 `new Integer()`를 호출
        -> 성능 최적화
         */
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("==: " + newInteger.equals(integerObj));
    }
}
