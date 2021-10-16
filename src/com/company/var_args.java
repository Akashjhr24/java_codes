package com.company;

public class var_args {
    static int sum(int ...arr)
    {
        int sum=0;
        for(int a:arr)
            sum+=a;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2,3,4,5= "+sum(2,3,4,5));
    }
}
