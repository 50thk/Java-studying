package study;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many fibonacci series numbers: ");
        int num = sc.nextInt();
        
        displayFibonacciSeries(num);
        sc.close();
    }

    static void displayFibonacciSeries(int n) {
        int x=0, y=1, z=0, count=1;
        while(count<=n) {
            System.out.print(z+"    ");
            z = x+y;
            x = y;
            y = z;
            count++;
        }
    }
}
