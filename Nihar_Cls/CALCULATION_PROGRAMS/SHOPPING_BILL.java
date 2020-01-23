package CALCULATION_PROGRAMS;

public class SHOPPING_BILL
{
    void main(double pa)
    {
        double d=0;
        double b=0;

        if(pa>=0 && pa<=5000)
        {
            d=pa*0.05;
        }
        else if(pa>=5001 && pa <=10000)
        {
            d=pa*0.1;
        }
        else if(pa>=10001 && pa<=20000)
        {
            d=pa*0.2;
        }
        else if(pa>20000)
        {
            d=pa*0.25;
        }
        else
        {
            System.out.println("WRONG AMT ENTERED");
        }
        b=pa-d;
        System.out.println("YOUR BILL IS RS. "+b);  
    }
}
