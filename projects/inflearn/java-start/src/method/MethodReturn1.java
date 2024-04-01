package method;

public class MethodReturn1 {//반환 타입

    /*
    반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야 한다.
    이 부부은 특히 조건문과 함께 사용할때 주의해야 합니다.
    */
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;//만약 해당 코드가 없다면 if문을 만족하면 true가 반환되지만, 조건을 만족하지 않으면 return문이 실행되지 않는다. 따라서 return문이 누락이 된 판정
        }
    }
}
