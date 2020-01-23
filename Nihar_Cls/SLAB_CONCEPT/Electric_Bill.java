package SLAB_CONCEPT;


/**
 * electric bill
 * 
 * 
 * 
 */
public class Electric_Bill
{
    void main(double u)
    {
        double b=0;
        int r=100;
        double fb;
        double st;
        if(u>=0 && u<=100)
        {
            b=u*0.75;                                                                                                         
        }
        else if(u>100 && u<130)
        {
            b=(100*0.75)+((u-100)*0.85);                                                                                      
        }
        else if(u>129 && u<158)
        {
            b=(100*0.75)+(29*0.85)+((u-129)*0.95);                                                                            
        }
        else if(u>157 && u<204)
        {
            b=(100*0.75)+(29*0.85)+(28*0.95)+((u-157)*1);                                                                     
        }
        else if(u>203)
        {
            b=(100*0.75)+(29*0.85)+(28*0.95)+(45*1)+((u-203)*1.2);                                                            
        }
        else
        {
            System.out.println("ENTERED WRONG NO. OF CALLS");                                                                 
        }
        b=b+100;
        st=b*0.125;
        fb=b+st;
        System.out.println("BILL = RS. "+b);
        System.out.println("SERVICE TAX = RS. "+st);
        System.out.println("FINAL BILL = RS. "+fb);
    }
}

