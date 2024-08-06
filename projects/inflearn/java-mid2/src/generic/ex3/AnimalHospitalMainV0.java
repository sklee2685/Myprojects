package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {// 타입 매개변수 제한1
    /**
     * 요구 사항
     * 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.
     *
     * 현재 문제점
     * 코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
     * 타입 안전성O: 타입 안전성이 명확하게 지켜진다.
     */
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

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

        // 문제1: 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입 입력으로 컴파일 오류 발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
