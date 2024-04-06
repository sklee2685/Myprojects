package class1;

public class ClassStart2 {//클래스가 필요한 이유2

    public static void main(String[] args) {//이전 코드를 배열을 사용해 재구성

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }

    }
    /*
    배열 사용의 한계
    배열읠 사용해 최소화에 성공했지만, 학새으이 데이터가 3개의 배열에 나눠어져 있다.
    -> 데이터를 변경할 때 매우 조심해서 작업해야함.
    -> 데이터를 변경할때 각 데이터의 요소에 맞게 데이터를 수정하거나 제거해야함
    ex) 학생2의 데이터를 제거시 학생1의 데이터가 삭제되지 않게 조심해야함.
     */
}
