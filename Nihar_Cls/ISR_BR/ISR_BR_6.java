package ISR_BR;
import java.io.*;

public class ISR_BR_6
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        char a,b;
        int c;
        
        System.out.println("ENTER A CHAR");
        a=(char)in.read();
        
        System.out.println("ENTER A CHAR");
        b=(char)in.read();
        
        System.out.println("ENTER A no.");
        c=Integer.parseInt(in.readLine());
        System.out.println(a+","+b);
        }
    }