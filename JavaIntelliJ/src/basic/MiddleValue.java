package basic;

public class MiddleValue {
    public static void main(String[] args) {

        int a=1000 , b=200 , c=3000 ;

        if ((a>b && a<c) || (a>c) && (a<b))
            System.out.println("A is middle");
        else if ((b>a && b<c) || (b>c) && (b<a))
            System.out.println("B is middle");
        else
            System.out.println("C is middle");
    }
}
