package ref;

public class VarChange2 {// 기본형 vs 참조형 - 참조형

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);// 참조 주소 값 출력
        System.out.println("dataB 참조값=" + dataB);// 위 코드랑 동일한 주소 값 출력
        System.out.println("dataA.value = " + dataA.value);// 10
        System.out.println("dataB.value = " + dataB.value);// 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);//20
        System.out.println("dataB.value = " + dataB.value);// 데이터가 들어있던 주소값을 전달 받은것으로 동일하게 20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);//30
        System.out.println("dataB.value = " + dataB.value);//30
    }// 기본형과 다르게 참조형은 값을 전달받는것이 아닌 주소값을 전달 받음
}
