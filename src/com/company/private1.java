package com.company;
class private1 {
    private int id;
    private String name;
    public void set_id(int n)
    {
        this.id=n;
    }
    public void set_name(String m)
    {
        this.name=m;
    }
    public int get_id()
    {
        return this.id;
    }
    public String get_name()
    {
        return this.name;
    }
}
class akash4
{
    public static void main(String[] args) {
        private1 p=new private1();
        p.set_id(5);
        p.set_name("Akash");
        System.out.println(p.get_id());
        System.out.println(p.get_name());
    }
}