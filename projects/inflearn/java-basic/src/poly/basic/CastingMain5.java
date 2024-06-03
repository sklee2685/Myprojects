package poly.basic;

public class CastingMain5 {// instanceof
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 입니다.");
            //Child child = (Child) parent; // 자바 16부터 사용가능(조건분에 Child child 바로 변수 선언)
            child.childMethod();
        }
    }
}
