package operationex;

public class OperationEx4 {
    public static void main(String[] args) {

        /*
        어디서든 변수의 값 재정의 가능
         */
        int num1 = 10;
        System.out.println(num1 += 1);
        System.out.println(num1 %= 10);
        System.out.println(num1);

        /*
        조건 연산자
        조건 ? 결과1:결과2; 조건이 True -> 결과1, False -> 결과 2
         */
        int num = (5>3)?10:20;
        System.out.println(num);
    }
}
