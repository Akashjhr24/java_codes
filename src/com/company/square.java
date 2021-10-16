package com.company;

class square {
    int side;
    public void get_side(int n)
    {
        side=n;
    }
    public int area(int n)
    {
        return n*n;
    }
    public int peri(int n)
    {
        return 4*n;
    }
}
class rectangle
{
    int l,b;
    public void get_sides(int a,int z)
    {
        l=a;
        b=z;
    }
    public int area()
    {
        return l*b;
    }
    public int peri()
    {
        return 2*(l+b);
    }
}
class Tommy
{
    public void running()
    {
        System.out.println("Tommy is running");
    }
    public void hitting()
    {
        System.out.println("Tommy is hitting");
    }
    public void swimming()
    {
        System.out.println("Tommy is swimming");
    }
}
class circle
{
    int radius;
    public void get_r(int a)
    {
        radius=a;
    }
    public void area()
    {
        System.out.println("The area of this circle is "+(3.14*radius*radius));
    }
    public void circum()
    {
        System.out.println("The circumference of this circle is "+(2*3.14*radius));
    }
}
class akash2
{
    public static void main(String[] args) {
        /*square s=new square();
        s.side=20;
        System.out.println(s.area(s.side));
        System.out.println(s.peri(s.side));
        rectangle r=new rectangle();
        r.get_sides(2,3);
        System.out.println(r.area());
        System.out.println(r.peri());
        Tommy t=new Tommy();
        t.hitting();
        t.running();
        t.swimming();*/
        circle c=new circle();
        c.get_r(5);
        c.area();
        c.circum();
    }
}
