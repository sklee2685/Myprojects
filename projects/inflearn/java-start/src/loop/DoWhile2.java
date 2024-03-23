package loop;

public class DoWhile2 {// do while(조건에 만족하지 않아도 한 번은 값을 출력함)

    public static void main(String[] args) {
        int i = 10;

        do {//do while으로 인해 조건문이 거짓이라도 한번은 코드 블럭을 실행함
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
