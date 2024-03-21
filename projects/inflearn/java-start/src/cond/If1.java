package cond;

public class If1 {// 조건문 if
    public static void main(String[] args) {
        int age  = 24; // 사용자 나이

        if(age >= 20){
            System.out.println("성인입니다.");
        }

        if (age <= 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
