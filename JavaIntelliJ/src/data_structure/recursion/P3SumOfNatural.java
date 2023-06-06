package data_structure.recursion;

public class P3SumOfNatural {

    public static void main(String[] args) {

        System.out.println("Main method started");
        int a=sumOfNatural(5);
        System.out.println("Sum is "+a);
        System.out.println("Main method end");
    }

    static int sumOfNatural(int n) {

        if(n==0)
            return 0;

        return n+sumOfNatural(n-1);
    }
}
