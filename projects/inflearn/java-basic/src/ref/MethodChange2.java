package ref;

public class MethodChange2 {//기본형 vs 참조형 - 참조형+메소드 호출

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 data.value = " + dataA.value);//10
        changeReference(dataA);
        System.out.println("메서드 호출 후 data.value = " + dataA.value);//20

    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
