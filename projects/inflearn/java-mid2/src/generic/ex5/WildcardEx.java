package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {//와일드 카드

    //비제한 와일드 카드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    //상한 와일드 카드
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " +t.getName());
    }
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal= box.get();
        System.out.println("이름 = " +animal.getName());
    }

    // 타입 매개 변수가 필요한 경우
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " +t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
