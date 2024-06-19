package extends1.super1;

public class Child extends Parent {
    public String value = "chile";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략가능

        //super으로 인해 자식클래스에 있는 value가 아닌 부모클래스에 있는 value가 실행
        System.out.println("super value = " + super.value);

        this.hello(); // this 생략가능
        super.hello();
    }
}
