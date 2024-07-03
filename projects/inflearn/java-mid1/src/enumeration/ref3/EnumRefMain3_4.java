package enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        //새로운 등급이 추가되어도 수정할 필요 없음
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
