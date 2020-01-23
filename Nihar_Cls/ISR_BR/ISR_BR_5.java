package ISR_BR;
import java.io.*;

public class ISR_BR_5
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        String a,b;
        System.out.println("ENTER NAME & SURNAME");
        a=(in.readLine());
        b=(in.readLine());
        
        System.out.println(a+" "+b);
        }
    }