package ISR_BR;
import java.io.*;

public class ISR_BR_7
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        char a,b;
        int c;
        
        System.out.println("ENTER A CHAR");
        a=in.readLine().charAt(0);        
        System.out.println("ENTER A CHAR");
        b=in.readLine().charAt(0);
        
        System.out.println(a+","+b);
        }
    }