package com.company;
import java.util.Scanner;
import java.util.Random;

public class practice_conditionals {
    public static void main(String[] args) {
        /*int age=10;
        if(age==10){
            System.out.println("I am 10");
        }
        else
            System.out.println("I am not 10");*/
        //Question 2
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        int m1=sc.nextInt();
        System.out.println("Enter marks of second subject");
        int m2=sc.nextInt();
        System.out.println("Enter marks of third subject");
        int m3=sc.nextInt();
        if(m1>=33 && m2>=33 && m3>=33)
        {
            float percent=((m1+m2+m3)/3.0f);
            if(percent>=40f)
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }
        else
            System.out.println("Fail");*/
        //Question 3
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        float income=sc.nextFloat();
        float tax;
        if(income>=2.5 && income<5.0)
        {
            tax=0.05f*income;
            System.out.println(tax);
        }
        else if(income>=5.0 && income<10.0){
            tax=0.2f*income;
            System.out.println(tax);
        }
        else if(income>=10.0)
        {
            tax=0.3f*income;
            System.out.println(tax);
        }
        else
            System.out.println("No tax");*/
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number");
        int day=sc.nextInt();
        switch(day)
        {
            case 1->
                System.out.println("Monday");
                case 2->
                    System.out.println("Tuesday");
            case 3->
                System.out.println("Wednesday");
            case 4->
                System.out.println("Thursday");
            case 5->
                System.out.println("Friday");
            case 6->
                System.out.println("Saturday");
            case 7->
                System.out.println("Sunday");
            default->
                System.out.println("Invalid input");



        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the website");
        String s=sc.next();
        if(s.endsWith(".com"))
            System.out.println("Commercial website");
        else if(s.endsWith(".org"))
            System.out.println("Organisational website");
        else if(s.endsWith(".in"))
            System.out.println("Indian Website");*/
        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);

    }
}
