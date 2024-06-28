package lang.wrapper;

public class AutoboxingMain2 {// 래퍼클래스 - 오토 박싱
    // 오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 자동으로 `valueOf()`,`xxxValue()`등의 코드를 추가해는 기동

    public static void main(String[] args) {
        //Primitive(기본형) -> Wrapper(특정 기본형을 감싸서(Wrap) 만드는 클래스)
        int value = 7;
        Integer boxedValue = value; //오토 박싱(Auto-boxing)
        //Integer boxedValue = Integer.valueOf(value); // 컴파일 단계에서 추가해 줌

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;// 오토 언박싱(Auto-Unboxing)
        //int unboxedValue = boxedValue.intValue(); // 컴파일 단계에서 추가해 줌

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValie = " + unboxedValue);
    }
}
