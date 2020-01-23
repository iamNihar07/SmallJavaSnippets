package TERM_1_PAPER_2013.SECTION_B;
import java.io.*;
public class Q8
{
    void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int n=0,t=0;
        
        System.out.println("ENTER NO. OF GALLONS CONSUMED");
        n=Integer.parseInt(in.readLine());

        if(n<=45)
        {
            t=0;
        }
        else if(n>45 && n<=75)
        {
            t=475;
        }
        else if(n>75 && n<=200)
        {
            t=750 + (10*(n-75));
        }
        else if(n>200 && n<=500)
        {
            t=1225 + (15*(n-200));
        }
        else
        {
            t=1500 + (20*(n-500));
        }
        System.out.println("Tax = "+t);
    }
}
