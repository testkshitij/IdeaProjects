package data_structure.recursion;

import java.util.Scanner;

public class P4Factorial {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        int fact=factorial(n);

        System.out.println("Factorial is "+fact);

    }

    private static int factorial(int n) {

        if (n==1 || n==0)
            return 1;

        return n*factorial(n-1);
    }
}
