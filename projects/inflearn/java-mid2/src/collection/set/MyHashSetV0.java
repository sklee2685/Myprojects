package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {// Set() 기능 직접 구현
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
