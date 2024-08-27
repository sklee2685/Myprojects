package collection.set;

public class StringHashMain { //문자를 숫자로 변경(문자 데이터를 기반으로 숫자 해시 인덱스 구하기)

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        //char(기본)
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int) charB);

        /**
         * hashCode
         * 모든 문자는 ASCII 코드로 인해 숫자로 변경 가능
         */
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
