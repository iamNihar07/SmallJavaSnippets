package PRACT;
import java.io.*;
public class Factors
{
    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=0,n=0;
        System.out.println("Enter no.");
        n=Integer.parseInt(in.readLine());
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Factor "+i);
            }
            
        }
    }
}

  