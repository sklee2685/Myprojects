package loop;

public class DoWhile1 {// do while(조건에 만족하지 않아도 한 번은 값을 출력함)

    public static void main(String[] args) {
        int i = 10;
        while(i<3){// 조건식이 거짓으로 실행되지x
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
