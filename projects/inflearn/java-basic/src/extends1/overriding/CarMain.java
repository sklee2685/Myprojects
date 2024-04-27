package extends1.overriding;

public class CarMain {// 상속 - 메서드 오버라이딩
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
}
