package poly.car1;

public class CarMain1 {//다형성 - 역할과 구현 예제 (다형성 사용)

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경 (k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 추가 및 변경(model3 -> newcar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

    }
}
