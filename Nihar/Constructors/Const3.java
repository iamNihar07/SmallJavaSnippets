package Constructors;
public class Const3
{
    int a,b;
    
    public Const3()
    {
        a=5;
        b=6;
    }
    
    Const3(int x,int y)
    {
        a=x;
        b=y;                
    }
    
    Const3(int z)
    {
        a=z;
        b=z;
    }
    
    public void disp()
    {
        System.out.println(a+","+b);
    }
}
