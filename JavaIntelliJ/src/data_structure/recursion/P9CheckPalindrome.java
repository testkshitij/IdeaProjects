package data_structure.recursion;

import java.util.Scanner;

public class P9CheckPalindrome {

    static boolean isPalindrome(int n)
    {
        return isPalindrome(n,0,n);
    }

    static boolean isPalindrome(int n, int rev,int temp)
    {
        if (n==0)
            return rev==temp;
        return isPalindrome(n/10,rev*10+n%10, temp);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        boolean rs=isPalindrome(n);

        if (rs)
            System.out.println("No is palindrome.");
        else
            System.out.println("No is not palindrome.");

    }

}
