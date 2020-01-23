package TERM_1_PAPER_2013.SECTION_B;
import java.io.*;
public class Q6
{
    void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int n=0,r=0,sum=0;
        
        System.out.println("ENTER NUMERO");
        n=Integer.parseInt(in.readLine());
        
        while(n>9)
        {
            sum=0;
            while(n!=0)
            {
                r=n%10;
                sum+=r;
                n=n/10;         
            }
            n=sum;
        }
        if (sum==1)
        {
            System.out.println("Magic NO.");
        }
        else
        {
            System.out.println("NOT Magic NO.");
        }

    }
}
