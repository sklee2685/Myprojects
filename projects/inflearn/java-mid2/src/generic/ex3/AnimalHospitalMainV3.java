package generic.ex3;


import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {//타입 매개변수 제한4 - 타입 매개변수 제한

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 50);

        // dog 병원
        dogHospital.set(dog);
        dogHospital.checkup();
        System.out.println();

        // cat 병원
        catHospital.set(cat);
        catHospital.checkup();
        System.out.println();

        //문제 1: 개 병원에 고양이 전달이 됨 => 해결
        //dogHospital.set(cat); // 다른 타입 입력으로 컴파일 오류 발생

        //문제 2: 개 타입 반환하는데 캐스팅이 필요 => 해결
        dogHospital.set(dog);
        Dog dog1 = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("dog1 = " + dog1);
    }
}
