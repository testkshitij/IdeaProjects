package data_structure.sorting;

import java.util.Arrays;

public class P20QuickSort {

    static void quickSort(int[] ar)
    {
        quickSort(ar,0,ar.length-1);
    }
    static void quickSort(int[] ar, int l , int h)
    {
        if (l<h)
        {
            int pr=partition(ar,l,h);
            quickSort(ar,l,pr-1);
            quickSort(ar,pr+1,h);
        }

    }

    static int partition(int[] ar, int l, int h)
    {
        int p=ar[l];
        int i=l+1,j=h;

        while (i<=j)
        {
            while (i<=j && ar[i]<p)
                i++;
            while (j>=i && ar[j]>p)
                j--;

            if(i<j)
            {
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
            i++;
            j--;
        }
        ar[l]=ar[j+1];
        ar[j+1]=p;
        return j+1;
    }

    public static void main(String[] args) {

        int ar[]={85,15,54,96,20};

        System.out.println("Before quick sort ");
        System.out.println(Arrays.toString(ar));

        quickSort(ar);

        System.out.println("After quick sort ");
        System.out.println(Arrays.toString(ar));

    }
}
