package data_structure.recursion;

import java.util.Scanner;

public class P13GCD {

    static int gcd(int m, int n) {

        if (m<n)
            return gcd(n,m);
        if (m%n==0)
            return n;

        return gcd(n,m%n);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no ");
        int m=sc.nextInt();
        System.out.println("Enter the 2nd no ");
        int n=sc.nextInt();

        int g=gcd(m,n);

        System.out.println("GCD is "+g);
    }


}
