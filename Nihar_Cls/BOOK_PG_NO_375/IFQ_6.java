package BOOK_PG_NO_375;

public class IFQ_6
{
    void main (double c)
    {
        double fb = 0;
        double d=0;
        if(c>0 && c<2001)
        {
            d=(0.05*c);
        }
        else if(c>2000 && c<5001)
        {
            d=c*0.25;
        }
        else if(c>5000 && c<10001)
        {
            d=c*0.35;
        }
        else if(c>10000)
        {
            d=c*0.5;
        }
        else
        {
            System.out.println("ERROR ");
        }
        fb=c-d;
        System.out.println("THE FINAL BILL IS RS. "+fb);
    }
}
