package data_structure.stack;

public class P21MainStack {

    public static void main(String[] args) {

        P21MyStack ms=new P21MyStack(5);
        ms.push(55+" ");
        ms.push(78+" ");
        ms.push(45+" ");
        ms.push(41+" ");
        ms.push(96+" ");
        System.out.println("Elements of stack are ");
        System.out.println(ms+" ");
        System.out.println("Size of stack "+ms.size());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms+" ");

        System.out.println(ms.peek());
        System.out.println(ms.peek());
        System.out.println(ms.peek());
    }

}
