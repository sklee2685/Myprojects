package generic.ex5;

public class Box <T>{//단순하게 데이터를 넣고 반환하는 제네릭 클래스

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
