package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 문제
 * 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
 * 따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 `Object` 로 가정하고, `Object` 의 기능만 사용할 수 있다.
 */
public class AnimalHospitalMainV2 {//타입 매개변수 제한3 - 제네릭 도입과 실패
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        // `Integer`, `Object`같은 동물과 관계 없는 타입을 타입 인자로 전달 가능하다는 문제 발생
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

    }
}
