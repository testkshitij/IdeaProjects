package data_structure.sorting;

import java.util.Arrays;

public class P19MergeSort {

    static void mergeSort(int[] ar,int l , int h)
    {
        if (l<h)
        {
            int m=(l+h)/2;
            mergeSort(ar,l,m);
            mergeSort(ar,m+1,h);
            mergeSort(ar, l,m, h);
        }
    }
    static void mergeSort(int[] ar, int l, int m, int h)
    {
        int n1=m-l+1;
        int n2=h-m;

        int a[]=new int[n1];
        int b[]=new int[n2];

        for (int i=0;i<n1;i++)
        {
            a[i]=ar[l+i];
        }
        for (int i=0;i<n2;i++)
        {
            b[i]=ar[m+1+i];
        }

        int i=0,j=0,k=l;

        while (i < n1 && j< n2)
        {
            if (a[i] < b[j])
                ar[k++]=a[i++];
            else ar[k++]=b[j++];
        }

        while (i<n1)
            ar[k++]=a[i++];
        while (j<n2)
            ar[k++]=b[j++];

    }

    public static void main(String[] args) {

        int ar[]={85,15,54,96,20};

        System.out.println("Before merge sort ");
        System.out.println(Arrays.toString(ar));

        mergeSort(ar,0,ar.length-1);

        System.out.println("After merge sort ");
        System.out.println(Arrays.toString(ar));

    }
}
