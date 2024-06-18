package lang.string.immutable;

public class StringImmutable1 {// String 클래스-불변 객체
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
