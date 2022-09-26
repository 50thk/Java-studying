package string;

public class StringTest {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);

        String str5 = new String("java");
        String str6 = new String("android");

        str5 = str5.concat(str6);

        System.out.println(str5);
        // 이 같이 문자열을 합쳣을 때에 새로운 주소가 생겨 gabage들이 생겨나는 데, 이를 방지하기 위해 StringBuilder, StringBuffer 사용

    }
}
