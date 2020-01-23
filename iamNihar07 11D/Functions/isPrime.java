package Functions;
import java.io.*;
public class isPrime
{
    void isPrime(int x)
    {
        int k=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                k++;
                break;
            }
        }
        
        if(k==0 && x!=1)
        {
            System.out.println("Prime.");
        } 
        else
        {
            System.out.println("Not Prime.");
        }
    }

    static void main()throws IOException
    {
        isPrime ob=new isPrime();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        ob.isPrime(n);
    }
}