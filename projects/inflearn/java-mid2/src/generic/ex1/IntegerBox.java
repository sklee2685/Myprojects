package generic.ex1;

public class IntegerBox {//제네릭 필요한 이유- 제네릭 미사용
    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }

}
