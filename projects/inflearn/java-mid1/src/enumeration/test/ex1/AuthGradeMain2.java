package enumeration.test.ex1;

import java.util.Arrays;
import java.util.Scanner;


/*
인증 등급 열거형 활용하기
**문제 설명**
`AuthGradeMain2` 클래스에 코드를 작성하자.
인증 등급을 입력 받아서 앞서 만든 `AuthGrade` 열거형으로 변환하자.
인증 등급에 따라 접근할 수 있는 화면이 다르다.
예를 들어 GUEST 등급은 메인 화면만 접근할 수 있고, ADMIN 등급은 모든 화면에 접근할 수 있다.
각각의 등급에 따라서 출력되는 메뉴 목록이 달라진다.
다음 출력 결과를 참고해서 코드를 완성하자.

**GUEST 입력 예**
```
당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: GUEST
당신의 등급은 손님입니다.
==메뉴 목록==
- 메인 화면
```

**LOGIN 입력 예**
```
당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: LOGIN
당신의 등급은 로그인 회원입니다.
==메뉴 목록==
- 메인 화면
- 이메일 관리 화면
```

**ADMIN 입력 예**
```
당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ADMIN
당신의 등급은 관리자입니다.
==메뉴 목록==
- 메인 화면
- 이메일 관리 화면
- 관리자 화면
```

**잘못된 값이 입력되는 경우**
```
당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: x
Exception in thread "main" java.lang.IllegalArgumentException: No enum constant
enumeration.test.AuthGrade.X
at java.base/java.lang.Enum.valueOf(Enum.java:293)
at enumeration.test.AuthGrade.valueOf(AuthGrade.java:3)
at enumeration.test.AuthGradeMain2.main(AuthGradeMain2.java:12)
```
**참고**: `Enum.valueOf()` 를 사용할 때 잘못된 값이 입력되면 예와 같이 `IllegalArgumentException` 예외가 발
생한다. 해당 예외를 잡아서 복구하는 방법은 예외 처리에서 학습한다.
 */
public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요"+ Arrays.toString(AuthGrade.values())+":");
        String grade = scanner.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}
