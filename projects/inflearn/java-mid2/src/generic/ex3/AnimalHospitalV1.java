package generic.ex3;

import generic.animal.Animal;

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
public class AnimalHospitalV1 {// 타입 매개변수 제한2 - 다형성 시도
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
    }
}
