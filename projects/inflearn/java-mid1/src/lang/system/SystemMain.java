package lang.system;

import java.util.Arrays;

public class SystemMain { //System 클래스
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        //환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = "+System.getProperties());

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        /*
        for문을 사용해서 가능하지만 반복 실행해야하는 단점이 있음
        -> arraycopy를 사용해 고속으로 복사 가능(한번에 복사해서 속도가 빠름)
        (복사할 배열,어디서 부터 복사할지, 복사한 데이터를 넣을 배열,복사할 데이터를 어디 부터 넣을지, 얼만큼 넣을지)
        */

        //배열 출력
        System.out.println("copiedArray = " + copiedArray); // 참조값이 출력됨
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 아래 코드가 있어도 해당 지점에서 프로그램이 종료됨


    }
}
