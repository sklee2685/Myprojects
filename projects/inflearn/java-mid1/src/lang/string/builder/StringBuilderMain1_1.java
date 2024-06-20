package lang.string.builder;

public class StringBuilderMain1_1 { // StringBuilder - 가변 String
    /*
    불편인 String의 내부 값은 변경이 불가하여,
    문자를 더하거나 변경할 때 마다 계속해서 새로운 객체를 생성해야 한다
    이를 해결하기 위해 가변 String인 StringBuilder을 제공
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        // 원하는 위치에 문자열 넣기
        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        // 특정 범위의 문자열 삭제
        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // 문자열 반대로 출력
        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String [가변String -> 불변String]
        String string = sb.toString();
        System.out.println("string = " + string);

    }
}
