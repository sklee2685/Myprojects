package exception.basic.checked;

public class Client {
    // throws 키워드는 발생된 예외를 메서드 밖으로 던질 때 사용됨
    public void call() throws MyCheckedException {

        //throw 키워드는 새로운 예외를 발생시킬 수 있다.
        throw new MyCheckedException("ex");
    }

}
