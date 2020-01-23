package PRACT;
import java.io.*;
public class Prime
{    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=0,n=0,k=0;
        System.out.println("Enter no.");
        n=Integer.parseInt(in.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("Prime.");
        }
        else
        {
            System.out.println("NOt prime.");
        }
    }
}

  