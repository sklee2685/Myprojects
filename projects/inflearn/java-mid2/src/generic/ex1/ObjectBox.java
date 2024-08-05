package generic.ex1;

public class ObjectBox { // BoxMain1의 문제점을 다형성을 통해 해결
    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
