package data_structure.recursion;

public class P1PrintNTo1 {

    public static void main(String[] args) {

        System.out.println("Main method started");
        display(8);
        System.out.println("Main method end");
    }

    static void display(int n)
    {
        System.out.println(n);
        if (n>1)
            display(n-1);
    }

}
