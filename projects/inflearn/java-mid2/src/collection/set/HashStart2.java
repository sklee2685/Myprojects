package collection.set;

import java.util.Arrays;

public class HashStart2 { // 해시(Hash) 알고리즘2 - index사용
    // 인덱스 번호 = 데이터 를 사용 ex) array[8] = 8, array[4] = 4, array[3] = 3 등
    public static void main(String[] args) {
        /*
        입력: 1, 2, 5, 8
        출력: [null, 1, 2, null, null, 5, null, null, 8, null]
         */
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 찾는 값 = 인덱스 번호이기 때문에 데이터 검색 성능이 좋아짐
        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
