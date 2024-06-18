package lang.string.immutable;

public class StringImmutable2 {// String 클래스-불변 객체
    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat(" java");
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
