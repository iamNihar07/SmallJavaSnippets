package TERM_1_PAPER_2013.SECTION_B;
import java.io.*;
public class Q7
{
    void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int n=0,i=0,pn=0,ps=0;

        for(i=1;i<=10;i++)
        {
            System.out.println("ENTER NUMERO");
            n=Integer.parseInt(in.readLine());
            if(n>0)
            {
                ps=ps+n;
            }
            else if(n<0)
            {
                pn=pn+n;
            }
        }
        
            System.out.println(ps);
            System.out.println(pn);
    }
}
