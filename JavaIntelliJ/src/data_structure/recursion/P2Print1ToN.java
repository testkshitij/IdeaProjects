package data_structure.recursion;

public class P2Print1ToN {

    public static void main(String[] args) {

        System.out.println("Main method started");
        display(8);
        System.out.println("Main method end");
    }

    static void display(int n)
    {
        if (n>1)
            display(n-1);

        System.out.println(n);

    }
}
