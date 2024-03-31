package array.ex;

public class ArrayEx1 {//배열을 사용해 코드 개선
    /*
    int student1 = 90;
    int student2 = 80;
    int student3 = 70;
    int student4 = 60;
    int student5 = 50;

    int total = student1 + student2 + student3 + student4 + student5;
    double average = (double) total / 5;

    System.out.println("점수 총합: " + total);
    System.out.println("점수 평균: " + average);

    **실행 결과 예시**

    점수 총합: 350
    점수 평균: 70.0
     */
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;

        /*for (int i = 0; i < students.length; i++) {
            total += students[i];
        }*/
        for (int student : students) {
            total += student;
        }

        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
