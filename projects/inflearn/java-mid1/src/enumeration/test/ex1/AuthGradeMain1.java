package enumeration.test.ex1;

/*
인증 등급 열거형 조회하기

**문제 설명**
`AuthGradeMain1` 이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
앞서 만든 `AuthGrade` 을 활용하자
```
grade=GUEST, level=1, 설명=손님
grade=LOGIN, level=2, 설명=로그인 회원
grade=ADMIN, level=3, 설명=관리자
 */
public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            printDescription(authGrade);
        }
    }
    private static void printDescription(AuthGrade grade){
        System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
    }
}
