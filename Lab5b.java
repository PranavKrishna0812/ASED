import Palindrome.Palindrome;

import Oddeven.Oddeven;

public class Lab5b {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Oddeven o = new Oddeven();
        
        // Test palindrome
        String t1 = "Racecar";
        boolean isPalindrome = p.isPalindrome(t1);
        System.out.println("\"" + t1 + "\" is a palindrome: " + isPalindrome);
        // Test odd/even
        int t2 = 42;
        boolean isEven = o.isEven(t2);
        System.out.println(t2 + " is even: " + isEven);
    }
}
