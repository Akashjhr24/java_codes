
package com.company;
class employee {
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public void getName()
    {
        System.out.println(name);
    }
    public void setName(String a)
    {
        name=a;
    }
}
class akash
{
    public static void main(String[] args) {
        employee e=new employee();
        e.salary=25000;
        e.name="Aman";
        System.out.println(e.getSalary());
        e.getName();
        e.setName("Abhay");
        e.getName();
    }
}
