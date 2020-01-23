package STRING_HANDLING;
import java.io.*;
public class Compare_with_CompareCommand
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string");
        String x = in.readLine();

        System.out.println("Enter another string");
        String y = in.readLine();

        if(x.compareTo(y)>0)
        {
            System.out.println(x+" is bigger");
            System.out.println(x.compareTo(y));
        }
        else if(x.compareTo(y)<0)
        {
            System.out.println(y+" is bigger");
            System.out.println(x.compareTo(y));
        }
        else
        {
            System.out.println("The strings, "+x+" & "+y+" are the same");
            System.out.println(x.compareTo(y));
        }
    }
}
