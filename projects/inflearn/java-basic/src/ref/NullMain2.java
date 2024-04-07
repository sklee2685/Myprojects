package ref;

public class NullMain2 {//NullPointerException 오류 - 지역변수일 경우
    /*
    참조값 없이 객체를 찾아가면 나오는 오류
     */
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;// => null.value
        System.out.println("data= " + data.value);
    }//해당 코드를 실행시키면 해당 오류가 나오는데 이처럼 null값에 .(dot)을 찍었을때 발생한다.
}
