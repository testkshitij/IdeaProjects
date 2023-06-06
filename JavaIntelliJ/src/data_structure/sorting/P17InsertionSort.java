package data_structure.sorting;

import java.util.Arrays;

public class P17InsertionSort {
    static void insertionSort(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            int key=ar[i];
            int j=i-1;
            while (j>-1 && ar[j]>key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
    }

    public static void main(String[] args) {

        int ar[]={85,15,54,96,20};

        System.out.println("Before insertion sort ");
        System.out.println(Arrays.toString(ar));

        insertionSort(ar);

        System.out.println("After insertion sort ");
        System.out.println(Arrays.toString(ar));

    }
}
