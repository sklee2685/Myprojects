package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {// 제네릭 타입과 제네릭 메서드의 우선순위
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T z) {// 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가짐
        //메서드의 타입 매개변수 `T` 는 상한이 없다. 따라서 `Object` 로 취급 -> Animal의 getName(),getSize()등 사용 불가
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        return z;
    }
}
