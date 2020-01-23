package ISR_BR;
import java.io.*;

public class ISR_BR_4
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        long a,b;
        System.out.println("ENTER 2 NO.S");
        a=Long.parseLong(in.readLine());
        b=Long.parseLong(in.readLine());
        
        System.out.println("DIFF. = "+(a-b));
    }
}