package pack;


public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();// 사용자와 같은 위치
        pack.a.User user = new pack.a.User();// 사용자와 다른 위치 (패키지 전체 경로를[pack.a.User] 포함해서 클래스를 적여야함)
    }
}
