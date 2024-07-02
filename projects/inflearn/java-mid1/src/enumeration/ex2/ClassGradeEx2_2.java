package enumeration.ex2;

public class ClassGradeEx2_2 {
    /*
    문제점
    외부에서 임의로 `ClassGrade` 의 인스턴스를 생성할 수 있다는 문제
     */
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        /*ClassGrade newClassGrade = new ClassGrade(); //생성자 private으로 막아야 함
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);*/
    }
}
