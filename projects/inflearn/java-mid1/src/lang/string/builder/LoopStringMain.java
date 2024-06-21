package lang.string.builder;

public class LoopStringMain { //String 최적화가 어려운 경우
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        //반복하는 만큼 객체를 생성해서 오래걸림
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
