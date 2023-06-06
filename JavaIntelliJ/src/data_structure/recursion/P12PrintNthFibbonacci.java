package data_structure.recursion;

public class P12PrintNthFibbonacci {

    static int getFib(int n) {

        if (n==1)
            return 0;
        if (n==2)
            return 1;

        return getFib(n-1)+getFib(n-2);

    }

    public static void main(String[] args) {

        int f1=getFib(5);

        System.out.println("Nth fibbonacci no is "+f1);
    }


}
