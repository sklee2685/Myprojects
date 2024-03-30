package array;

public class Array1 {//배열이 필요한 이유

    /*
    학생 수가 증가함에 따라 코딩 양이 비례해서 증가하느느 문제와, int형 변수를 계속해서 추가해야하는 문제가 발생
    -> 비슷한 변수를 반복해서 선언하는 문제가 발생

   반복문으로 통해 해결 가능한거처럼 보이지만, 반복문을 통해 변수명은 변경x
     */
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int student6 = 40;

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);
        System.out.println("student6 = " + student6);

    }
}
