package lang.wrapper;

public class AutoboxingMain1 {// 래퍼클래스 - 박싱

    public static void main(String[] args) {
        //Primitive(기본형) -> Wrapper(특정 기본형을 감싸서(Wrap) 만드는 클래스)
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValie = " + unboxedValue);
    }
}
