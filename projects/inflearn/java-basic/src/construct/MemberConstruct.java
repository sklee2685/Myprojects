package construct;

public class MemberConstruct {//생성자
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {//생성자 오버로딩
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
    /*
    this() 규칙**
    `this()` 는 생성자 코드의 첫줄에만 작성할 수 있다.
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    /*
    생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
    생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
    생성자는 반환 타입이 없다. 비워두어야 한다.
    나머지는 메서드와 같다.
     */
}
