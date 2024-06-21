package lang.string.chaining;

public class MethodChainingMain3 { //메서드 체인닝
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        /*
        **adder의 참조 값을 x001이라고 가정하자**

        adder.add(1).add(2).add(3).getValue() //value=0
        x001.add(1).add(2).add(3).getValue() //value=0, x001.add(1)을 호출하면 그 결과로 x001
        을 반환한다.
        x001.add(2).add(3).getValue() //value=1, x001.add(2)을 호출하면 그 결과로 x001을 반환한
        다.
        x001.add(3).getValue() //value=3, x001.add(3)을 호출하면 그 결과로 x001을 반환한다.
        x001.getValue() //value=6

        요약
        메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반환된 참조값을 사용해서 메서드 호출을 계속 이어갈 수 있다.
         */
        System.out.println("result = " + result);
    }
}
