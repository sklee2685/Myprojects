package poly.ex2;

public class AnimalPolyMain2 {// 배열과 for문을 활용해 반복문 제거
    /*
    남은 문제점
    1. Animal클래스를 생성할 수 있는 문제
    2. Animal클래스를 상속받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 경우[오타, 누락 등] -> 컴파일 오류가 발생하지 않아 오류 잡기가 힘듬

    해당 문제점들은 추상 클래스와 추상 메서드를 사용해 해결 가능
     */
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();
//        Duck duck = new Duck();
//
//        Animal[] animalArr = {dog, cat, caw, duck};

        Animal animal1 = new Animal();
        animal1.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()}; //축약 가능

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물을 추가해도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
}
