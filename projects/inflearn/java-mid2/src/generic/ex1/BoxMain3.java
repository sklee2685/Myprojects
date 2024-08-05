package generic.ex1;

public class BoxMain3 { // 제네릭 사용
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정 -> 코드 재사용 좋아짐
        integerBox.set(10);
        //integerBox.set("문자100"); //컴파일 오류 발생 -> 타입 안전성 높아짐
        Integer integer = integerBox.get(); //Integer 타입 반환(캐스팅x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String str = stringBox.get();
        System.out.println("string = " + str);

        //또 다른 원하는 모든 타입 사용 가능(기본형은 x)
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox</*생략가능*/>();
    }
}
