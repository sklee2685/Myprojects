package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);// 부모클래스인 ClassB에 기본 생성자가 없음 -> super()를 사용하거나 생략 불가
        System.out.println("ClassC 생성자");


    }
}
