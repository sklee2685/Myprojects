package generic.ex3;

import generic.animal.Animal;

/**
 * 문제
 * 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
 * 따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 `Object` 로 가정하고, `Object` 의 기능만 사용할 수 있다.
 */
public class AnimalHospitalV2<T> {//타입 매개변수 제한3 - 제네릭 도입과 실패
    public T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        /**
         * T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
         * 타입 매개변수인 T에 Integer이 올지 Dog가 올지 모르기 때문
         *  Object의 기능만 사용 가능
         */
        animal.toString();
        animal.equals(null);

        /**
         * 컴파일 오류
         * System.out.println("동물 크기: " + animal.getSize());
         * animal.sound();
         */
    }

    public T getBigger(T target) {
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
        return null;
    }
}
