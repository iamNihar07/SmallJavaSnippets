package Constructors;

public class HCF_LCM
{
    int a,b;
    
    HCF_LCM(int x,int y)
    {
        a=x;
        b=y;
    }
    
    
    
    void calculate()
    {
        int hcf=0,lcm=0;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
               
            }
        }
        lcm=(a*b)/hcf;
        
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
    