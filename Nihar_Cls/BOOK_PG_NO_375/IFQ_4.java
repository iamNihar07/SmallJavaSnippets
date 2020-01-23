package BOOK_PG_NO_375;

public class IFQ_4
{
    void main (double cp, double sp)
    {
        if(sp>cp)
        {
            double p = sp-cp;
            double pp =(p/100)*cp;
            System.out.println("PROFIT = "+p+" & PROFIT PERCENT = "+pp);
        }
        else if (cp>sp)
        {
            double l = cp-sp;
            double lp = (l/100)*cp;
            System.out.println("LOSS = "+l+" & LOSS PERCENT = "+lp);
        }
        else
        {
            System.out.println("NEITHER PROFIT NOR LOSS");
        }
    }
}
