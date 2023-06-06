package data_structure.stack;

public class P22MainRunner {

    public static void main(String[] args) {

        P22Employee e1=new P22Employee(123,"Rajesh",12547.23);
        P22Employee e2=new P22Employee(124,"Mahesh",25412.32);
        P22Employee e3=new P22Employee(125,"Adarsh",47856.23);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e1.equals(e1));
    }
}
