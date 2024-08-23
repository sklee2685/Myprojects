package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 { // 해시(Hash) 알고리즘5 - 해시 충돌 구현
    /*

     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //데이터를 담을 바구니(연결 리스트[LinkedList]) 만들기
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // LinkedList를 넣을 수 있는 배열
        System.out.println("buckets = " + Arrays.toString(buckets));
        /*
        [null, null, null, null, null, null, null, null, null, null]
         */

        for (int i = 0; i < CAPACITY; i++) { // buckets 초기화
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        /*
        [[], [], [], [], [], [], [], [], [], []]
         */
        // 1, 2, 5, 8, 14, 99 라는 데이터 입력
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //해시 인덱스 중복 값
        System.out.println("buckets = " + Arrays.toString(buckets));

        //데이터 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        if (!bucket.contains(value)) {// 동일한 해시 인덱스가 있는지 확인
            bucket.add(value);
        }

    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);

        /*
        // 위에 코드를 풀어 쓰면 다음과 같다.
        for (Integer data : bucket) {
            if (data == searchValue) {
                return true;
            }
        }
        return false;
        */
    }

    static int hashIndex(int value) {//해시 인덱스 구하기
        return value % CAPACITY;
    }
}
