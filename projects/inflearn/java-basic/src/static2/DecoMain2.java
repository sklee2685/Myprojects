package static2;

public class DecoMain2 {// static 메소드
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);// 정적 메소드를 통해 불필요한 객체 생성 없이 메서드를 사용함

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
