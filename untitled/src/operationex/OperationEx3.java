package operationex;

public class OperationEx3 {

    public static void main(String[] args) {
        /*
        && = and
        || = or
        우항에 변수에 대한 값을 재정의 가능
         */
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) > 10 && ((i = i+2) < 10));
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
