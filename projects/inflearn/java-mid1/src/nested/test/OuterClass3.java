package nested.test;

public class OuterClass3 {//지역 클래스를 완성해라

    public void myMethod() {
        // 여기에 지역 클래스 LocalClass를 구현하고 hello() 메서드를 호출해라.
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
