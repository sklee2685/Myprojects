package generic.ex1;

public class GenericBox<T> {// 제네릭 사용
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
