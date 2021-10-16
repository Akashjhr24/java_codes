package com.company;
class phone{

    public void ringing()
    {
        System.out.println("Cellphone ringing");
    }
    public void vibrating()
    {
        System.out.println("Cellphone vibrating");
    }
    public void download()
    {
        System.out.println("File downloading");
    }
}
class akash1
{
    public static void main(String[] args) {
        phone p=new phone();
        p.ringing();
        p.download();
        p.vibrating();
    }

}
