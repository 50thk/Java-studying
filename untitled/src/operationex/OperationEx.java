package operationex;

public class OperationEx {
    // 대입 연산자의 우선순위는 가장 낮음
    public static void main(String[] args) {
        int age = 24;
        System.out.println(age);

        int num = 10;
        int num2 = -num;
        System.out.println(num);
        System.out.println(num2);

        num = -num;
        System.out.println(num);

    }
}
