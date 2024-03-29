package data_structure.stack;

import java.util.Scanner;
import java.util.Stack;

public class P24EvaluatePostfixExpression {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valid postfix expression ");
        String st=sc.next();
        double ev=evaluate(st);
        System.out.println("Evaluated value is "+ev);
    }

    static double evaluate(String st)
    {
        Stack<Double> stk=new Stack<Double>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (Character.isAlphabetic(ch))
            {
                System.out.println("Enter the value of "+ch);
                double v=sc.nextDouble();
                stk.push(v);
            }
            else
            {
               double y=stk.pop();
               double x=stk.pop();
               switch (ch)
               {
                   case '+':
                       stk.push(x+y);
                       break;
               }
            }
        }
        return stk.pop();
    }

}
