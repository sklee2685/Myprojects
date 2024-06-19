package method.ex;

public class MethodEx3 {//입출금 리펙토링
    /*
    다음은 입금, 출금을 나타내는 코드이다.
    입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자.

    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        int depositAmount = 1000;
        balance += depositAmount;

        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        // 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
    }
    실행 결과**
    ```
    1000원을 입금하였습니다. 현재 잔액: 11000원
    2000원을 출금하였습니다. 현재 잔액: 9000원
    최종 잔액: 9000원
     */
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");

    }

    // 현재 잔액 및 입금할 금액을 입력 받으면 +연산자를 통해 더한 값 return
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    // 현재 잔액 및 입금할 금액을 입력 받으면 -연산자를 통해 뺀 값 return하는데,
    //if문을 통해 잔액이 부족하면 잔액 부족 문구 출력
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
