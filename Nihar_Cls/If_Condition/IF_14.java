package If_Condition;
import java.io.*;
public class IF_14
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double usd=0;
        System.out.println("ENTER DOLLAR AMT");
        usd=Integer.parseInt(in.readLine());
        double inr =usd*59.84;
        System.out.println("INR VAL. = "+inr);
        }
    }
 
        

