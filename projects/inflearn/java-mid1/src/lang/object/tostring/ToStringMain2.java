package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍1",2);
        Dog dog2 = new Dog("멍멍2",5);

        System.out.println("1. 단순 toString 호출\n");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출\n");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.objPrint(car);
        ObjectPrinter.objPrint(dog1);
        ObjectPrinter.objPrint(dog2);

        //참조값으로 변환
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue1 = "+refValue1);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = "+refValue2);

    }
}
