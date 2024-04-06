package class1;

public class ClassStart3 {//클래스 사용

    public static void main(String[] args) {
        Student student1 = new Student();// Student 객체 생성( 참조값 x001 반환)
        student1.name = "학생1";// student1 객체의 name 멤버 변수에 값을 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2;// Student 객체 생성
        student2 = new Student();//참조값 x002 반환
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 85;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age  + " 성적: " +  student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age  + " 성적: " +  student2.grade);
    }
}
