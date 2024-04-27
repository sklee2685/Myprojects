package extends1.ex2;
public class CarMain {
    public static void main(String[] args) {// 상속 - 사용
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // ElectricCar 클래스에 가면 해당 기능은 없음 -> 부모 클래스인 Car에 해당 기능이 있음
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //  GasCar 클래스에 가면 해당 기능은 없음 -> 부모 클래스인 Car에 해당 기능이 있음
        gasCar.fillUp();
    }
}
