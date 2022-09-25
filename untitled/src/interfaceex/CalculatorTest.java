package interfaceex;

public class CalculatorTest {

    public static void main(String[] args) {

        Calc calculator = new CompleteCalc();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.times(5, 4));
        System.out.println(calculator.divide(2,0));
        // calculator.showInfo();는 CompleteCalc로 타입을 지정해야 가능
        calculator.description();

        int[] arr = {1,2,3,4,5};

        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
