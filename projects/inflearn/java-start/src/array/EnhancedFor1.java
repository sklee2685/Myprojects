package array;

public class EnhancedFor1 {//향상된 for문 -> for-each문
    /*
    앞서 일반 for문과 동일하게 작동한다.
    향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 단순히 해당 배열을 처음부터 끝까지 탐색한다.

    for (변수 : 배열 또는 컬렉션) {
        // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
    }
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();

        //향산된 for문, for-each문(단축어 iter)
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        //for-each문을 사용할 수 없는 경우, 증가하느느 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }//int i 와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우에는 향상된 for문을 사용할 수 없다.
    }
}
