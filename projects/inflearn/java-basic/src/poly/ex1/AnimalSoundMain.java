package poly.ex1;

public class AnimalSoundMain {// 다형성 활용x
    /* Dog,Cat,Caw의 타입이 서로 다르기 떄문에 중복 제거 시도가 불가능하다.
       -> 모두 같은 타입을 사용할 수 있는 방법이 있다면 메서드와 배열을 활용해 중복 제거가 가능함 -> 다형성 활용
    */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //코드 중복 제거 시도2
        //Caw[] cawArr = {caw, caw1, caw2}; // 타입이 달라서 사용x

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCaw(caw);
    }

    //코드 중복 제거 시도1
    private static void soundCaw(Caw caw) {// caw 전용 메소드, 다른 동물은 사용 못한다는 단점이 있음
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
