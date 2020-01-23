package ISR_BR;
import java.io.*;

public class ISR_BR_2
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        float a,b;

        System.out.println("ENTER 1ST NO.");
        a=Float.parseFloat(in.readLine());

        System.out.println("ENTER 2ND NO.");
        b=Float.parseFloat(in.readLine());

        System.out.println("Product = "+(a*b));
    }
}
