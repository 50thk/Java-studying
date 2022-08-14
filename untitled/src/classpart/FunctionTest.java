package classpart;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int sum = addNum(num1, num2);
        System.out.println(sum);

    }
    // void = return 값이 없을 때
    // 함수 사용 시 stack 메모리 사용
    public static int addNum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
