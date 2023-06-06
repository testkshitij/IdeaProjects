package basic;

import java.util.Scanner;

public class Power {

    static int pow(int n, int p) {
        int pw=1;
        while (p!=0)
        {

            pw=pw*n;
            p--;
        }
        return pw;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no and power ");
        int n=sc.nextInt();
        int p=sc.nextInt();


        int p1=pow(n,p);

        System.out.println(p1);
    }


}
