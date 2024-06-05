package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("테스트 종료\n");
    }
}
