package CALCULATION_PROGRAMS;

public class COMMISSION
{void main(double sa)
    {double c=0;
        double b=0;

        if(sa>=0 && sa<=15000)
        {
            c=sa*0.05;
        }
        else if(sa>=15001 && sa <=50000)
        {
            c=sa*0.1;
        }
        else if(sa>=50001 && sa<=100000)
        {
            c=sa*0.15;
        }
        else if(sa>100000)
        {
            c=sa*0.2;
        }
        else
        {
            System.out.println("WRONG AMT ENTERED");
        }
        System.out.println("YOUR COMISSION IS RS. "+c);  
    }
}