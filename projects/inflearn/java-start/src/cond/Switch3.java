package cond;

public class Switch3 {//switch문 break 없는 vr
    public static void main(String[] args) {
        /*
        당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
        이 프로그램은 `int grade` 라는 변수를 사용하며, 회원 등급( `grade` )에 따라 다음의 쿠폰을 발급해야 한다.
        1등급: 쿠폰 1000
        2등급: 쿠폰 2000
        3등급: 쿠폰 3000
        위의 등급이 아닐 경우: 쿠폰 500
        각 쿠폰이 할당된 후에는 `"발급받은 쿠폰 " + 쿠폰값` 을 출력해야 한다.
        2등급 사용자 출력 예)
        발급받은 쿠폰 2000
        */

        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:// break가 없으면 중단하지 않고 그 다음 case로 넘어가 코드르 실행 함
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);// 2등급 쿠폰에 break가 없어서 3등급 쿠폰이 적용됨
    }
}
