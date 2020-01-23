
public class OverLoad2
{
    void number(String x)
    {
        String rw="";
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            rw=ch+rw;
        }
        System.out.println("reversed word= "+rw);
    }
    
    void number(int x)
    {
        int m=x,d=0;
        int sq=x*x;
        while(m!=0)
        {
            m=m/10;
            d++;
        }
        
        if(x==(int)(sq%Math.pow(10,d)))
        {
            System.out.println("Automorphic number.");
        }
        else
        {
            System.out.println("not automorphic.");
        }
    }
    
    void main()
    {
        number(".niaga eM stI"); //execute this
        number(28);
    }
}
