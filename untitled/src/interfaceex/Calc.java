package interfaceex;

public interface Calc {
    double PI = 3.14; // interface에서 정의를 하게 되면 public static final double
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("Calc");
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }
        return total;
    }
}
