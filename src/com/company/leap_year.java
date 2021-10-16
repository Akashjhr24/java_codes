package com.company;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year");
        int yr=sc.nextInt();
        boolean flag=true;
        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    flag=true;
                }
                else
                    flag=false;
            }
            else
                flag=true;
        }
        else
            flag=false;
        if(flag)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
