package ISR_BR;
import java.io.*;
public class ISR
{  void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a,b,c;

        System.out.println("Enter 1st no.");
        a=Integer.parseInt(in.readLine());

        System.out.println("Enter 2nd no.");
        b=Integer.parseInt(in.readLine());

        c=a+b;
        System.out.println("SUM = "+c);
    }
}
