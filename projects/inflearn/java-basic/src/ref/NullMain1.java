package ref;

public class NullMain1 {//null

    public static void main(String[] args) {
        Data data = null;//아직 가리키는 대상이 없음
        System.out.println("1. data = " + data);
        data = new Data();//data 변수에 참조값을 할당
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }//아직 가리키는 대상이 없거나, 가리키는 대상을 나중에 입력하고 싶을때 주로 사용
    // 하지만 만약 변수가 지속적으로 null인 상태이면 자바에서는 자동적으로 메모리에서 해당 데이터를 제거함
    // -> 메모리 부족을 예방하기 위해
}
