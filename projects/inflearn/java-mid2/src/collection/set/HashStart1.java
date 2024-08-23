package collection.set;

import java.util.Arrays;

public class HashStart1 { // 해시(Hash) 알고리즘1 -시작
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        for (Integer inputValue : inputArray) { //데이터를 모두 찾아서 값을 비교해야 함
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
