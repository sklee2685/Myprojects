package class1;

public class ClassStart1 {//클래스가 필요한 이유1

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int sutdent1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int sutdent2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + sutdent1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + sutdent2Grade);

    }// 문제점 데이터를 추가하려면 많은 양의 코드를 추가해야함 -> 배열을 사용해 해결 가능
}
