package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); //컴파일 오류, Object는 sound()가 없음
        //obj.move();  //컴파일 오류, Object는 move()가 없음

        //해결법 -> 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
        /*
        // 위에 코드랑 동일한 코드
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            dog.sound();
        } else if (obj instanceof Car) {
            Car car = (Car) obj;
            car.move();
        }
         */
    }
}
