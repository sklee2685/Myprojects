package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("테스트 종료\n");
    }
}
