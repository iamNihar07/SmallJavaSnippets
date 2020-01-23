package SLAB_CONCEPT;

/**
 *
 * 
 * 
 * 
 */
public class INCOME_TAX
{
    void main(double m)
    {
        double y=m*12;
        double it=0;
        if(y>=0 && y<=120000)
        {
            it=y*0;
        }
        else if(y>120000 && y<300000)
        {
            it=(120000*0) + ((y-120000)*0.10);
        }
        else if(y>300000 && y<1000001)
        {
            it=(120000*0) + (180000*0.10) + ((y-300000)*0.15);
        }
        else if(y>1000000)
        {
            it=(120000*0) + (180000*0.10) + (700000*0.15) + ((y-1000000)*0.20);
        }       
        else
        {
            System.out.println("WRONG YEARLY INCOME ENTERED");
        }
        System.out.println("I TAX IS RS. "+it);
    }
}

