package memory.static2;

public class DecoUtil2 {
    public static String deco(String str) {// static을 붙어줌으로써 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
        return "*" + str + "*";
    }
}
