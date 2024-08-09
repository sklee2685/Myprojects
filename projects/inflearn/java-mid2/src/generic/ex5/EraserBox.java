package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        //return param instanceof T; //이레이저로 인해 오류 발생
        return false;
    }

    public void create() {
        //return new T(); //이레이저로 인해 오류발생
    }

}
