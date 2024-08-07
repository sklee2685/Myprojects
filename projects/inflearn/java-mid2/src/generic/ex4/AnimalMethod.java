package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {//AnimalHospitalMainV3를 제네릭 메서드 활용해서 Ref

    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름 = " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T getBigger(T target1, T target2) {
        return target1.getSize() > target2.getSize() ? target1 : target2;//삼항 연산자
    }
}
