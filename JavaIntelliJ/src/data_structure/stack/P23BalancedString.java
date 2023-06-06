package data_structure.stack;

import java.util.Scanner;
import java.util.Stack;

public class P23BalancedString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String st=sc.next();

        boolean rs=isBalanced(st);

        if(rs)
            System.out.println("String is balanced..");
        else
            System.out.println("String is not balanced..");
    }

    static boolean isBalanced(String st)
    {
        if (st.length()%2==1)
            return false;

        Stack<Character> stk=new Stack<Character>();

        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);

            if (ch=='{' || ch=='(' || ch=='[')
                stk.push(ch);
            else
            {
                if (stk.isEmpty())
                    return false;
                char pch=stk.pop();
                if (ch=='}' && pch!='{')
                    return false;
                if (ch==']' && pch!='[')
                    return false;
                if (ch==')' && pch!='(')
                    return false;
            }
        }
        return stk.isEmpty();
    }
}
