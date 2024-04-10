package pack;

import pack.a.*;
/*
위에 코드는 아래코드 2개와 동일한 기능을 수행한다.
import pack.a.User;
import pack.a.User2;
 */

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
