package basic;

public class StringPalindrome {

    static boolean isPalindrome(String st)
    {
        int i=0;
        int j=st.length()-1;

        while (i<j)
        {
            if(st.charAt(i)!=st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

        String st="madam";

        boolean rs=isPalindrome(st);

        if (rs)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
