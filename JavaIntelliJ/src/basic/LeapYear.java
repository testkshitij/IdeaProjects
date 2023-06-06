package basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        /*System.out.println("Enter the year ");


        int yy=sc.nextInt();

        if(yy%4==0 && yy%100!=0 || yy%400==0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");

         */

        System.out.println("Enter 3 no ");
        int a=sc.nextInt();  //99
        int b=sc.nextInt();  //20
        int c=sc.nextInt();  //92

      //  int big= (a>b) ? a : b;

        //    big=big>c ? big : c;

        //    System.out.println(big);

        int n=(a>b && a>c) ?   a : (b>c) ? b : c;

        System.out.println(n);
    }


}
