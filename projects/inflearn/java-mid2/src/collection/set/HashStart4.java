package collection.set;

import java.util.Arrays;

public class HashStart4 { // 해시(Hash) 알고리즘4 - 나머지 연산
    /**
     * 데이터 % CAPACITY(데이터의 크기) = index번호(=해시 인덱스)
     * `1 % 10 = 1`
     * `2 % 10 = 2`
     * `5 % 10 = 5`
     * `8 % 10 = 8`
     * `14 % 10 = 4`
     * `99 % 10 = 9`
     * 단, 데이터가 9, 99가 있으면 동일하게 해시 인덱스가 9로 동일하게 나와 충돌이 일어나는 문제가 발생
     * -> 해시 충돌
     */
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // 1, 2, 5, 8, 14, 99 라는 데이터 입력
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        //데이터 저장
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        System.out.println();

        //데이터 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex];
        System.out.println("result = " + result);
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {//해시 인덱스 구하기
        return value % CAPACITY;
    }
}
