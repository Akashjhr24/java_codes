package com.company;
import java.util.Locale;
import java.util.Scanner;

public class practice_set {
    public static void main(String[] args) {
        //Question 1
        Scanner sc=new Scanner(System.in);
        //System.out.println("Please enter  a string");
        //String s=sc.nextLine();
        //System.out.println(s.toLowerCase());
        //Question 2
        System.out.println("Please enter a string");
        String s =sc.nextLine();
        //System.out.println(s.replace(" ","_"));
        //Question 3
        String st="Dear <name>, thanks a lot.";
        System.out.println(st.replace("<name>",s));

    }
}
