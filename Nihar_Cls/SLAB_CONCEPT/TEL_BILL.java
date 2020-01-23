package SLAB_CONCEPT;

/**
 * WAP to calculate telephone bill
 * of a person'
 * Input calls made according to following conditions
 * Calculate the bill.
 * c>=o c<=100   rate = free
 * c>=101 c<=200 rate = 0.80/c
 * c>=201 c<=500 rate = 1.0/c
 * c>500         rate = 1.2/c
 */
public class TEL_BILL
{
    void main(int c)
    {
        double b=0;
        int r=150;
        double fb;
        double st;
        if(c>=0 && c<=100)
        {
            b=c*0;
        }
        else if(c>100 && c<201)
        {
            b=(100*0)+((c-100)*0.8);
        }
        else if(c>200 && c<501)
        {
            b=(100*0)+(100*0.8)+((c-200)*1);
        }
        else if(c<500)
        {
            b=(100*0)+(100*0.8)+(300*1)+((c-500)*1.2);
        }
        else
        {
            System.out.println("Entered invalid no. of calls");
        }
        b=b+r;
        st=b*0.125;
        fb=b+st;
        System.out.println("Your bill is Rs. "+b);
        System.out.println("Service Tax is Rs. "+st);
        System.out.println("Your final bill is Rs. "+fb);
    }
}

