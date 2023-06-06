package data_structure.recursion;

public class P11ProductOfDigits {

    static  int productOfDigits(int n)
    {
        if (n==0)
            return 1;
        return n%10*productOfDigits(n/10);
    }

    public static void main(String[] args) {

        int sum=productOfDigits(25);

        System.out.println("Product is "+sum);


    }
}
