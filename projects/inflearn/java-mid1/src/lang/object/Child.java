package lang.object;

// extends Parent를 함으로써 명시적으로 상속을 받음
public class Child extends Parent {// 명시적 상속
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
