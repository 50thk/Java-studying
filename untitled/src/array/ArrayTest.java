package array;

public class ArrayTest {

    public static void main(String[] args) {

        // int numbers[] = new int[10]; 도 가능

        int[] numbers = new int[10];
        numbers[0] = 1;

        for(int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] num = new int[] {0, 1, 2};

        System.out.println(num);
    }
}
