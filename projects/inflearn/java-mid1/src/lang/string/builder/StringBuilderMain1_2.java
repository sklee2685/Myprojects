package lang.string.builder;

public class StringBuilderMain1_2 { // StringBuilder - 메서드 체인닝

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);

    }
}
