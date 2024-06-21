package lang.string.chaining;

public class ValueAdder {

    private int value;

    //값을 누적해서 더하는 메서드
    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
