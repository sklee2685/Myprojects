package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {// 상속 - 사용x
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 공통된 기능
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 공통된 기능
        gasCar.fillUp();
    }
}
