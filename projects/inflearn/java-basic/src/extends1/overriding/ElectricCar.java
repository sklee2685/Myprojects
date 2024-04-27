package extends1.overriding;

public class ElectricCar extends Car {//자식 클래스 - 메서드 오버라이딩

    @Override // 없어도 동작하는데 문제는 없음 (코드의 명확성을 위해 사용하는걸 권장)
    public void move() {
        System.out.println("전기차를 이동합니다.");
    }
    public void charge() {
        System.out.println("충전을 시작합니다.");
    }
}
