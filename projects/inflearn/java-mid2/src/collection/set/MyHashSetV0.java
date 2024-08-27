package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {// Set() 기능 직접 구현
    /**
     * 직접 구현한 Set()의 단점
     * add()로 데이터를 추가할 때 Set에 중복 데이터가 있는지 전체 데이터를 항상 확인해야함 -> 입력 성능이 나쁨
     * contains()로 데이터를 찾을때 Set에 있는 모든 데이터를 찾고 비교해야 함
     *
     * 정리
     * 데이터를 찾거나 추가할때, 중복 데이터가 있는지 모든 데이터를 다 찾아 찾아봐야 하기 때문에 성능이 좋지 못함
     */
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {

        if (contains(value)) { //중복값 체크 만든거 사용
            return false;
        }
        elementData[size] = value; //입력한 데이터 저장
        size++;
        return true;
    }

    public boolean contains(int value) {//중복값 체크

        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
