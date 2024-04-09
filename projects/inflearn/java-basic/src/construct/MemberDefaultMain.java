package construct;

public class MemberDefaultMain {//기본 생성자
    /*
    **기본 생성자**
    매개변수가 없는 생성자를 기본 생성자라 한다.
    클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으
    로 만들어준다.
    **생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.**
     */
    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();

    }
    /*
    정리
    생성자는 반드시 호출되어야 한다.
    생성자가 없으면 기본 생성자가 제공된다.
    **생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다.** 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
     */
}
