package array;

public class Array1Ref2 {//배열 리펙토링
    /*
    리펙토링: 기존 코드 기능은 유지하면서 내구 구조를 개선하여 가독성을 높임(버그를 줄이고 프로그램의 성능을 향상시킬 수 도 있음)
     */
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {//students.length 배열 students의 길이 -> 5
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);

        }
    }
}
