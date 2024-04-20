package memory.static1;

public class Data3 {// static 활용
    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }//Data1의 코드와 동일하지만 변수 선언에서 static을 사용함
}
