package nested.test;

public class AnonymousMain{// 익명 클래스를 완성해라

    public static void main(String[] args) {
        //여기에 Hello의 익명 클래스를 생성하고 hello()를 호출해라.
        Hello hello1 = new Hello(){
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        hello1.hello();
    }
}
