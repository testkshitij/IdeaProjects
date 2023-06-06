package basic;

public class ToUppercase {

    static String toUpperCase(String st)
    {
        char ch[]=st.toCharArray();

        for (int i=0;i<st.length();i++)
        {
             ch[i]=ch[i];
        }
        return null;
    }
    public static void main(String[] args) {

        String st="madam";

        String rs= toUpperCase(st);

        System.out.println(rs);

    }
}
