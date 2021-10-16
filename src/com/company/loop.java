package com.company;
import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;
       /* for(i=4;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        System.out.println("Enter a number");
        int n=sc.nextInt();
      /*  i=0;
        int count=0;
        while(i<=n)
        {
         if(i%2==0)
             count+=i;
         i++;
        }
        System.out.println("The sum of even numbers till "+n+" is "+count);*/
        /*i=1;
        while(i<=10)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }*/
        /*i=10;
        while(i>=1)
        {
            System.out.println(n+"*"+i+" = "+(n*i));
            i--;
        }*/
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("The factorial of "+n+" is = "+fact);

    }
}
