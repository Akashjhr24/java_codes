package com.company;

public class method_overloading {
    static void ff()
    {
        System.out.println("Hello How are you?");
    }
    static void ff(int a)
    {
        System.out.println("Hello "+a+" How are you");
    }
    public static void main(String[] args) {
        ff(33);

    }
}
