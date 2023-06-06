package data_structure.recursion;

public class P10SumOfDigits {

    static  int sumOfDigits(int n)
    {
        if (n==0)
            return 0;
        return n%10+sumOfDigits(n/10);
    }

    public static void main(String[] args) {

        int sum=sumOfDigits(25);

        System.out.println("Sum is "+sum);


    }
}


