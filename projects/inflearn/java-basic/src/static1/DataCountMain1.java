package static1;

public class DataCountMain1 {// static의 필요 이유 -인스턴스 내부 변수에 카운트 저장하는 프로그램
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("A count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("A count = " + data3.count);

    }// 정상 작동x
}
