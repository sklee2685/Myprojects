package array;

public class Array1Ref4 {//배열의 초기화
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10};// new int[] 생략 가능

        for (int i = 0; i < students.length; i++) {//students.length 배열 students의 길이 -> 5
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);

        }
    }
}
