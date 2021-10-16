package com.company;
import java.util.*;

public class array_practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* float [] arr={2.5f,4.6f,6.7f,7.8f,9.9f};
        int i;
        float sum=0.0f;
        for(i=0;i<arr.length;i++)
            sum+=arr[i];
        System.out.printf("%.2f",sum);*/
       /* int [] arr={2,3,56,7,8};
        int i;
        int n=10;
        int f=-1;
        for(i=0;i<arr.length;i++)
            if(arr[i]==n) {
                f=i;
                System.out.println("Element is present at index " + i);
                break;
            }
        if(f==-1)
            System.out.println("Element is not present");

        
        System.out.println("Enter the no. of students");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int i;
        System.out.println("Start entering the marks");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        float sum=0.0f;
        for(int j:arr)
        {
            sum+=j;
        }
        System.out.println(sum/n);

        //Program to sum two matrices
        int [][]p=new int[2][3];
        int [][]q=new int[2][3];
        System.out.println("Start entering the elements in matrix 1");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                p[i][j]=sc.nextInt();
            }
        }
        System.out.println("Start entering the elements in matrix 2");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                q[i][j]=sc.nextInt();
            }
        }
        int [][]r=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                r[i][j]=p[i][j]+q[i][j];
            }
        }
        System.out.println("After adding the two matrices");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }

        //Program to reverse an array
        int [] arr={2,3,4,5,6,7};
        int j=arr.length;
        int [] arr1=new int[j];
        for(int k=j-1;k>=0;k--)
        {
            arr1[j-1-k]=arr[k];
        }
        for(int r:arr1)
            System.out.print(r+" ");

        //Program to find maximum element in an array
        int[] arr={34,56,758,5678,34,1};
        int max=0;
        for(int i:arr)
        {
            if(i>max)
                max=i;
        }
        System.out.println(max);
        //Program to find the minimum element in an array
        int[] arr={2,34,5678,43,1,987};
        int min=99999999;
        for(int i:arr)
        {
            if(i<min)
                min=i;
        }
        System.out.println(min);*/
        //Program to find whether an array is sorted or not
        int[] arr={2,3,5,4,6,7,8};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i]) {
                System.out.println("Array is not sorted");
                flag = false;
                break;
            }
        }
        if(flag==true)
            System.out.println("Array is sorted");

    }
}
