package REVISION_80_MKS_PAPER_2012;
import java.io.*;
public class Q_6_1
{
    void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a,t;
        double p,amt=0.0,i;
        String n;

        System.out.println("ENTER NAME AND AGE");
        n=in.readLine();
        a=Integer.parseInt(in.readLine());

        System.out.println("ENTER THE PRINCIPAL AMT");
        p=Integer.parseInt(in.readLine());

        System.out.println("ENTER NO. OF YEARS");
        t=Integer.parseInt(in.readLine());

        if(a<60)
        {

            switch(t)
            {
                case 1:
                i=(p*t*7.5)/100;
                amt=p+i;
                break;

                case 2:
                i=(p*t*8.5)/100;
                amt=p+i;
                break;

                case 3:
                i=(p*t*9.5)/100;
                amt=p+i;
                break;

                default :
                i=(p*t*10.0)/100;
                amt=p+i;
                break;
            }
        }
        else if(a>59)
        {

            switch(t)
            {
                case 1:
                i=(p*t*8.0)/100;
                amt=p+i;
                break;

                case 2:
                i=(p*t*9.0)/100;
                amt=p+i;
                break;

                case 3:
                i=(p*t*10.0)/100;
                amt=p+i;
                break;

                default :
                i=(p*t*11.0)/100;
                amt=p+i;
                break;
            }
        }

        System.out.println("Rs."+p+" will become Rs."+amt+" after "+t+" years"); 
    }
}
