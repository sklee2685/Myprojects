package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
        /*
        처음에 입력한 10이 출력됨
        ->obj1.add(20)을 하게되면 30이라는 값이 나오긴하지만 해당 값을 가지고있는 객체를
        출력한게 아님(리턴 값을 사용하지 못한것)
         */

    }

}
