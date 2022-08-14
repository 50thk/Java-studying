package operationex;

public class OperationEx5 {
    public static void main(String[] args) {

        /*
        비트연산자
        & = and
        | = or
        ^ = xor
        ~ = reverse
        << = 왼쪽Shift
        >> = 오른쪽Shift
         */

        int num1 = 5;
        int num2 = 10;

        int result = num1 & num2;
        System.out.println(result);

        int num3 = 5;
        System.out.println(num3 << 1); // 5*2^1
        System.out.println(num3 << 2); // 5*2^2

        System.out.println(num3 >> 1); // 5/2^1
        System.out.println(num3 >> 2); // 5/2^2
    }
}
