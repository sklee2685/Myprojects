package collection.set;

import java.util.Arrays;

public class HashStart3 { // 해시(Hash) 알고리즘3 - 메모리 낭비
    /*
    인덱스 번호 = 데이터 를 사용 ex) array[8] = 8, array[4] = 4, array[3] = 3 등
    단, 데이터가 커지면 커질 수록 메모리 낭비가 되는 문제가 발생
    따라서 데이터의 값을 인덱스로 사용하는 방식은 입력 값의 범위가 넓다면 사용하기 어려워짐
    */
    public static void main(String[] args) {
        /*
        입력: 1, 2, 5, 8,14,99
        출력: [null, 1, 2, null, null, 5, null, null, 8, null, ..., 14, ..., 99]
         */
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 데이터의 검색 속도는 빠름
        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
