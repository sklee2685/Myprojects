package array;

public class Array1Ref1 {//배열의 선언과 생성(Array1 예제를 변경)

    public static void main(String[] args) {
        int[] students;// int형 배열 변수 선언(배열 변수에느느 **배열을 담을 수 있다**)
        students = new int[5];//배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);
        System.out.println("student6 = " + students[5]);

    }
}
