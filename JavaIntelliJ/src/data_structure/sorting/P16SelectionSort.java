package data_structure.sorting;

import java.util.Arrays;

public class P16SelectionSort {

    static void selectionSort(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            int index=i;
            for (int j=i+1;j<ar.length;j++)
            {
                if (ar[index]>ar[j])
                {
                    index=j;
                }
                int temp=ar[i];
                ar[i]=ar[index];
                ar[index]=temp;
            }
        }
    }

    public static void main(String[] args) {

        int ar[]={85,15,54,96,20};

        System.out.println("Before selection sort ");
        System.out.println(Arrays.toString(ar));

        selectionSort(ar);

        System.out.println("After selection sort ");
        System.out.println(Arrays.toString(ar));

    }
}
