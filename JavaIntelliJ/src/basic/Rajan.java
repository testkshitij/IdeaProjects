package basic;

import java.util.Scanner;

public class Rajan {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        int fact=1;

        while (n!=0)
        {
            fact=fact*n;
            n--;
        }

        System.out.println(fact);
    }
}
