package cond;

public class CondOp2 {//삼항 연산자 (계산하는 항이 3개이다.) 사용ㅇ vr

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18 ) ? "성인" : "미성년자"; // (조건) ? 참_표현식 : 거짓_표현식
        /*if (age >=18 ){
            status ="성인";
        } else {
            status = "미성년자";
        }*/
        System.out.println("age = " + age + " status = " + status);
    }
}
