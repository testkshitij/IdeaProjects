package data_structure.recursion;

public class P5SearchElement {
    public static void main(String[] args) {

        int[] ar={5,15,20,30,35,40,48};

        int a=search(ar,30);

        if(a==-1)
            System.out.println("Element is not present..");
        else
            System.out.println("Element is present at "+a);
    }

    static int search(int[] ar, int ele)
    {
        return search(ar,ele,0);
    }

    static int search(int[] ar,int ele, int i)
    {
        if(i==ar.length)
            return -1;
        if(ar[i]==ele)
            return i;
        return search(ar, ele, i+1);
    }
}
