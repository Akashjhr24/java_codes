package com.company;

public class mult {
   /* static void mult1(int n)
    {
        for(int i=1;i<=10;i++)
            System.out.println(n+"*"+i+"= "+(n*i));
    }
*/
    public static void main(String[] args) {
        System.out.println("The average of given numbers= "+avg(1,2,3,4,5));
    }
    /*static void print_star(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    static void print_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println("Th sum of first n natural numbers= "+sum);
    }
    static void print_pattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
    }*/
    //print the average of numbers passed as arguments
    static float avg(int ...arr)
    {
        int sum=0;
        int c=0;
        for(int i:arr) {
            sum += i;
            c += 1;
        }
        float average=sum/c;
        return average;


    }

}
