package com.company;

class Employee
{
    int id;
    String name;
    int salary;
    public void print_details()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int get_salary()
    {
        return salary;
    }
}
class akash_custom
{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee e=new Employee();
        e.id=1;
        e.name="AKASH";
       Employee j=new Employee();
       j.id=2;
       j.name="Harry";
        e.print_details();
        j.print_details();
        j.salary=13000;
        e.salary=12000;
        System.out.println(j.get_salary());
        System.out.println(e.get_salary());

    }
}