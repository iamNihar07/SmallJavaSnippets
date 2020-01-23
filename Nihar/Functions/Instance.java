package Functions;
import java.io.*;
public class Instance
{
    int carmanu;
    static int totalcarmanu;
     void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the cars manufactured by you.");
        int n=Integer.parseInt(in.readLine());

        carmanu=carmanu+n;
        totalcarmanu=totalcarmanu+n;

        System.out.println("Cars manufactured by you- "+carmanu);
        System.out.println("Cars manufactured by us- "+totalcarmanu);
    }
}
