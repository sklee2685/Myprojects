package generic.ex3;


import generic.animal.Cat;
import generic.animal.Dog;

/**
 * `Dog` , `Cat` 은 `Animal` 이라는 명확한 부모 타입이 있다. 다형성을 사용해서 중복을 제거해보자.
 *
 * 문제
 * 코드 재사용O: 다형성을 통해 `AnimalHospitalV1` 하나로 개와 고양이를 모두 처리한다.
 * 타입 안전성X
 * 개 병원에 고양이를 전달하는 문제가 발생한다.
 * `Animal` 타입을 반환하기 때문에 다운 캐스팅을 해야 한다.
 * 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외가 발생한다.
 */
public class AnimalHospitalMainV1 {// 타입 매개변수 제한2 - 다형성 시도

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

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

        //문제 1: 개 병원에 고양이 전달이 됨
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류 발생하지 않음
        dogHospital.checkup();
        System.out.println();

        //문제 2: 개 타입 반환하는데 캐스팅이 필요
        dogHospital.set(dog);
        Dog dog1 = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("dog1 = " + dog1);
    }
}
