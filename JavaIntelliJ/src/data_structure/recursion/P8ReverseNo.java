package data_structure.recursion;

import java.util.Scanner;

public class P8ReverseNo {

    static int reverse(int n)
    {
        return reverse(n,0);
    }

    static int reverse(int n, int rev)
    {
        if (n==0)
            return rev;
        return reverse(n/10,rev*10+n%10);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        int rs=reverse(n);

        System.out.println("Reverse is "+rs);

    }
}
