package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest { //자바에서 제공하는 리스트 성능 비교
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size); // 앞에 데이터 추가
        addMid(new ArrayList<>(), size);// 중간에 데이터 추가

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용
        addLast(arrayList, size);// 뒤에 데이터 추가

        System.out.println();

        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, loop, 0); // 앞에 조회
        getIndex(arrayList, loop, size/2); // 중간 조회
        getIndex(arrayList, loop, size-1); // 마지막 조회

        System.out.println();

        System.out.println("==ArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);


        System.out.println();

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size); // 앞에 데이터 추가
        addMid(new LinkedList<>(), size);// 중간에 데이터 추가

        LinkedList<Integer> linkedList = new LinkedList<>();//조회용 데이터로 사용
        addLast(linkedList, size);// 뒤에 데이터 추가

        System.out.println();

        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, loop, 0); // 앞에 조회
        getIndex(linkedList, loop, size/2); // 중간 조회
        getIndex(linkedList, loop, size-1); // 마지막 조회

        System.out.println();

        System.out.println("==LinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

    }

    private static void addFirst(List<Integer> list, int size) {// 앞에 데이터 추가
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {// 중간에 데이터 추가
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {// 뒤에 데이터 추가
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {//데이터 조회
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {//데이터 검색
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
