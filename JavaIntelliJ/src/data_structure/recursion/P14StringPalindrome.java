package data_structure.recursion;

public class P14StringPalindrome {

    static boolean isPalindrome(String st) {

        return isPalindrome(st,0,st.length()-1);
    }

    static boolean isPalindrome(String st,int i,int j) {

        if (i>j)
            return true;
        if (st.charAt(i)!=st.charAt(j))
            return false;
        return isPalindrome(st,i+1,j-1);
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("dear"));

    }


}
