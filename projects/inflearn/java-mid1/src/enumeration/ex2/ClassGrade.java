package enumeration.ex2;

public class ClassGrade {//타입 안전 열거형 패턴을 직접 구현
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가
    private ClassGrade(){}

}
