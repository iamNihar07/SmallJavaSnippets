package STRING_HANDLING;
import java.io.*;
public class Compare_with_equalsCommand
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string");
        String x = in.readLine();

        System.out.println("Enter another string");
        String y = in.readLine();

        if(x.equals(y))
        {
            System.out.println("Strings are perfectly equal.");
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("Strings are equal with ignored case");
        }
        else
        {
            System.out.println("Strings not equal");
        }
    }
}

      