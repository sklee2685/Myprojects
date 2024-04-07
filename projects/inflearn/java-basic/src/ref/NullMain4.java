package ref;

public class NullMain4 {//NullPointerException 오류 - 멤버 변수인 경우

    public static void main(String[] args) {//오류 해결
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
