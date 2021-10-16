package com.company;
import java.util.Scanner;
public class hello
{
    public static void main(String[] args) {
        int a=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int s=sc.nextInt();
        if(s>a)
        {
            System.out.println("The entered number is greater than a ");
        }
    }
}
