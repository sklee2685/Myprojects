package cond;

public class If3 {// 조건문 else if1
    public static void main(String[] args) {
        /*
        7세 이하일 경우: "미취학"
        8세 이상 13세 이하일 경우: "초등학생"
        14세 이상 16세 이하일 경우: "중학생"
        17세 이상 19세 이하일 경우: "고등학생"
        20세 이상일 경우: "성인"
        */

        int age = 14;

        if(age <= 7) { //~7: 미취학
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) { //8~13: 초등학생
                System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        }
        if (age >= 20) { //20~: 성인
            System.out.println("성인");
        }
    }
}
