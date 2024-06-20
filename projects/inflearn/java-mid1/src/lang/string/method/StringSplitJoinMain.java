package lang.string.method;

public class StringSplitJoinMain { //문자열 분할 및 조합

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split() => ","을 기준으로 문자열을 나눔
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join() 없이 문자열 조합
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr.length == (i+1)) {
                joinStr += splitStr[i];
            }else {
                joinStr += splitStr[i]+"-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        //join() =>"A", "B", "C"를 붙이는데 문자 중간에 "-"를 사용
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);

    }
}
