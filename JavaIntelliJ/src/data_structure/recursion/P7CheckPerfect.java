package data_structure.recursion;

import java.util.Scanner;

public class P7CheckPerfect {

    static  boolean isPerfect(int n)
    {
        return  isPerfect(n,1,0);
    }

    static  boolean isPerfect(int n,int i,int sum)
    {
        if (i>n/2)
            return sum==n;
        if (n%i==0)
            sum=sum+i;
        return isPerfect(n,i+1,sum);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();

        boolean rs=isPerfect(n);

        if (rs)
            System.out.println("No is perfect.");
        else
            System.out.println("No is not perfect.");
    }
}
