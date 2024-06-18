package scanner.ex;

public class ChangeVarEx {// 변수 값 교환
    /*
    변수 `a=10` 이 들어있고, `b=20` 이 들어있다.
    변수 `a` 의 값과 변수 `b` 의 값을 서로 바꾸어라
    다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
    힌트: `temp` 변수를 활용해야 한다.
    **출력 결과**
    ```
    a = 20
    b = 10
    */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        // 자바는 항상 변수의 값을 복사해서 대입한다는 특징으로 인해

        temp = a;
        //10(temp) = 10(a)

        a = b;
        //20(a) = 20(b)

        b = temp;
        //10(b) = 10(temp) 으로 나타낼 수 있음

        System.out.println("a = "+a+"\n"+"b = "+b);
    }
}
