package Constructors;
public class PQR
{
    public void main()
    {
        Const3 you=new Const3();
        you.disp();

        int a=17;
        int b = 18;

        Const3 we=new Const3(a,b);
        we.disp();

        int z = 8;
        Const3 us = new Const3(z);
        us.disp();

        Const3 rahul =new Const3();
        rahul.disp();
        int n= abc();
        System.out.println(n);
    }

    int abc()
    {
        System.out.println("Learnt constructors");
        return 2;
    }

}