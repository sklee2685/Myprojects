package generic.ex1;

public class StringBox {//제네릭 필요한 이유- 제네릭 미사용
    private String value;

    public void set(String object) {
        this.value = object;
    }

    public String get() {
        return value;
    }
}
