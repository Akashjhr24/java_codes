import java.io.*;
import java.util.*;
public class array {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        reverse(arr,start,end);
        System.out.println("After reversing");
        for(int j=0;j<arr.length;j++)
            System.out.print(arr[j]+" ");

    }
    static void reverse(int arr[], int start, int end)
    {
        if(start>end)
            return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr,start+1,end-1);
    }
}
