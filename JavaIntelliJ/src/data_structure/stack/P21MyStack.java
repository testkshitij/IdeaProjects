package data_structure.stack;

public class P21MyStack {

    int capacity,top=-1;
    Object stk[];

    public P21MyStack(int capacity)
    {
        this.capacity=capacity;
        stk=new Object[capacity];
    }

    public void push(Object ele)
    {
        if (top==capacity-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        stk[++top]=ele;
    }
    public String toString()
    {
        String st="[";
        for (int i=0;i<=top;i++)
        {
            st=st+stk[i]+"";
        }
        return st+"]";
    }
    public  int size()
    {
        return top+1;
    }
    public Object pop()
    {
        if (top==-1)
        {
            System.out.println("Stack overflow");
            return "";
        }
        return stk[top--];
    }
    public Object peek()
    {
        if (top==-1)
        {
            System.out.println("Stack underflow");
            return "";
        }
        return stk[top];
    }
}
