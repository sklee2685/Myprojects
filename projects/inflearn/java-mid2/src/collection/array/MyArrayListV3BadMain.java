package collection.array;

public class MyArrayListV3BadMain {//직접 구현하는 배열 리스트4 - 제네릭1

    /**
     * 앞서 만든 `MyArrayList` 들의 단점
     *`Object` 를 입력받기 때문에 아무 데이터나 입력할 수 있고, 또 결과로 `Object` 를 반환한다.
     * 따라서 필요한 경우 다운 캐스팅을 해야하고, 또 타입 안전성이 떨어지짐
     *
     * --> 해결법: 제네릭 사용
     */
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); //문자를 입력
        System.out.println(numberList);

        //Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //ClassCaseException 발생, 문자를 Integer로 캐스팅
        Integer num3 = (Integer) numberList.get(2);
    }
}
