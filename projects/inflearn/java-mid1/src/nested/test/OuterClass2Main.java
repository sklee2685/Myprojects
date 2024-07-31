package nested.test;

public class OuterClass2Main {//내부 클래스를 완성해라
    // 여기에서 InnerClass의 hello() 메서드를 호출해라.
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
