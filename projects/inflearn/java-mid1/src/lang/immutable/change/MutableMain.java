package lang.immutable.change;

public class MutableMain { //변경 가능한 객체에서 값을 변경하는 간단한 예
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        System.out.println("obj= " + obj.getValue());
        obj.add(20);

        // 계산 이후 기존 값이였던 10은 사라짐
        System.out.println("obj= " + obj.getValue());

    }
}
