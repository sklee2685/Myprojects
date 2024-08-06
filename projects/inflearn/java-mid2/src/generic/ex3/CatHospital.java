package generic.ex3;

import generic.animal.Cat;

/**
 * 요구 사항
 * 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.
 *
 * 현재 문제점
 * 코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
 * 타입 안전성O: 타입 안전성이 명확하게 지켜진다.
 */
public class CatHospital {// 타입 매개변수 제한1
    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
    }
}
