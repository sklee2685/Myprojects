package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 { // AnimalMethod 사용
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.checkup(dog);// 제네릭 메서드 타입 추론으로 <Dog>생략됨
        //AnimalMethod.<Dog>checkup(dog); //타입 추론 없는 코드
        System.out.println();

        AnimalMethod.checkup(cat);// 제네릭 메서드 타입 추론으로 <Cat>생략됨
        //AnimalMethod.<Cat>checkup(cat); //타입 추론 없는 코드

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);// 제네릭 메서드 타입 추론으로 <Dog>생략됨
        //Dog bigger = AnimalMethod.<Dog>getBigger(dog, targetDog); //타입 추론 없는 코드
        System.out.println("bigger = " + bigger);

    }
}
