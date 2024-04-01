package method;

public class MethodReturn2 {
    /*
    18살 미만의 경우: 미성년자는 출입이 불가합니다.
    18살 이상의 경우: 입장하세요.
     */
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미셩년자는 출입이 불가능합니다.");
            return;//return을 만나면 거기서 메소드는 종료된다. break문 느낌?
        }
        System.out.println(age + "살, 입장하세요.");
    }

}
