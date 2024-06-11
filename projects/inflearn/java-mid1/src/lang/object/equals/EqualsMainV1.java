package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 참조값이 달라 false 반환
        System.out.println("equality = " + user1.equals(user2)); // equals가 있는 Object클래스로 가보면 위 코드와 동일하게 == 으로 비교함
        /*
        public boolean equals(Object obj) {
        return (this == obj);
        }
         */
    }
}
