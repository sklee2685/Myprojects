package construct;

public class MemberThis {//this의 생략
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;//nameField 앞에 this가 생략되어있음
    }//이 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고 없으면 그 다음 으로 멤버 변수를 찾는다
}
