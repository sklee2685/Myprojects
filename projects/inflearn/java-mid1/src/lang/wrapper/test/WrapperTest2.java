package lang.wrapper.test;

public class WrapperTest2 {//parseDouble()
    /*
    배열에 입력된 모든 숫자의 합을 구하자. 숫자는 `double` 형이 입력될 수 있다.
    **실행 결과**
    sum = 7.0
     */
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;

        for (String ad : array) {
            double arrayDouble = Double.parseDouble(ad);
            sum += arrayDouble;
        }
        System.out.println("sum = " + sum);
    }
}
