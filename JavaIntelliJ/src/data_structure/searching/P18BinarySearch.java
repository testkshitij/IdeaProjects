package data_structure.searching;

import java.util.Arrays;

public class P18BinarySearch {

    static int binarySearch(int[] ar ,int ele)
    {
        return binarySearch(ar,ele,0,ar.length-1);
    }

    static int binarySearch(int[] x ,int ele,int low , int high)
    {
        if (high<low)
            return -1;

        int mid=(low+high)/2;

        if (x[mid]==ele)
            return mid;

        if (x[mid]<ele)
            return binarySearch(x,ele,mid+1,high);
        else
            return binarySearch(x,ele,low,mid-1);
    }


    public static void main(String[] args) {

        int ar[]={15,20,55,75,89};
        int ele=20;

        int in= binarySearch(ar,ele);

        if (in==-1)
            System.out.println("Element is not present..");
        else
            System.out.println("Element is present at "+in);


    }

}
