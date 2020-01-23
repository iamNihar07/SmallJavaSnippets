package PRACT;
import java.io.*;
public class Factorial
{
    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=0,n=0,f=1;
        System.out.println("Enter no.");
        n=Integer.parseInt(in.readLine());

        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}

    