package com.company;
import java.util.Scanner;
public class marks
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        float a=sc.nextFloat();
        System.out.println("Enter marks of second subject");
        float b=sc.nextFloat();
        System.out.println("Enter marks of third subject");
        float c=sc.nextFloat();
        System.out.println("Enter marks of fourth subject");
        float d=sc.nextFloat();
        System.out.println("Enter marks of fifth subject");
        float e=sc.nextFloat();
        System.out.print("The aggregate percentage is: ");
        System.out.println((a+b+c+d+e)/500*100);



    }
}
