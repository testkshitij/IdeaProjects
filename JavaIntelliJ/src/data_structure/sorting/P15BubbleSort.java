package data_structure.sorting;

import java.util.Arrays;

public class P15BubbleSort {

    static void bubbleSort(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            for (int j=1;j<ar.length-i;j++)
            {
                if (ar[j-1]>ar[j])
                {
                    int temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int ar[]={85,15,54,96,20};

        System.out.println("Before bubble sort ");
        System.out.println(Arrays.toString(ar));

        bubbleSort(ar);

        System.out.println("After bubble sort ");
        System.out.println(Arrays.toString(ar));

    }
}
