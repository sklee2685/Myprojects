package exception.basic.unchecked;

public class Client { //체크 예외일땐 throws를 throws를 선언했지만, 언체크 예외에선 생략됨
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
