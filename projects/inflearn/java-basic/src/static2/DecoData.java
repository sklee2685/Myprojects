package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {// 정적 메서드로 static만 사용 가능
        //instanceValue++;// 인스턴스 변수 접근, compile error
        //instanceMethod();// 인스턴스 메서드 접근,compile error

        staticValue++;//정적 변수 접근
        staticMethod();//정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {// 인스턴스 메서드로 모든 곳에서 호출 가능
        instanceValue++;// 인스턴스 변수 접근
        instanceMethod();// 인스턴스 메서드 접근

        staticValue++;//정적 변수 접근
        staticMethod();//정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
