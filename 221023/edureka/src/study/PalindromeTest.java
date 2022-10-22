package study;

import java.util.Scanner;

public class PalindromeTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string for checking ass palindrome: ");
        String word = sc.next();

        if(isPalindrome(word))
            System.out.println(word+" is Palindrome");
        else
            System.out.println(word+" is not Palindrome");

    }

    static boolean isPalindrome(String word) {
        int forwardIndex=0, backwordIndex=word.length()-1;
        while(forwardIndex<=backwordIndex) {
            char startChar = word.charAt(forwardIndex);
            char endChar = word.charAt(backwordIndex);

            if(startChar != endChar)
                return false;
            
            forwardIndex++;
            backwordIndex--;
        }
        return true;
    }
}
