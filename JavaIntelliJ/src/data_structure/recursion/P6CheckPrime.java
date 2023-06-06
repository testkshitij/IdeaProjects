package data_structure.recursion;

import java.util.Scanner;

public class P6CheckPrime {

    static boolean isPrime(int n)
    {
        return isPrime(2,n);
    }

    static  boolean isPrime(int i,int n)
    {
        if (i>n/2)
            return true;
        if (n%i==0)
            return  false;
        return isPrime(i+1,n);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        boolean rs=isPrime(n);

        if (rs)
            System.out.println("No is prime.");
        else
            System.out.println("No is not prime.");

    }


}
