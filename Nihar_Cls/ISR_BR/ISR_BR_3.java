package ISR_BR;
import java.io.*;

public class ISR_BR_3
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        double a,b;
        System.out.println("Enter 1st no.");
        a=Double.parseDouble(in.readLine());

        System.out.println("Enter 2nd no.");
        b=Double.parseDouble(in.readLine());

        System.out.println("Product = "+(a*b));
    }
}
