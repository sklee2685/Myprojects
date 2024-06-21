package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        /*
        adder, adder1, adder2, adder3은 this로 인해 자기 자신의 참조값을 반환함
        -> 모두 같은 참조값을 사용
         */

        int result = adder3.getValue();
        System.out.println("result = " + result);
    }
}
