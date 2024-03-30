package array;

public class ArrayDi4 {//구조 개선-값 입력
    /*
    배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력하도록 변경
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

    }
}
