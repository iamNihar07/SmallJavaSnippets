package Functions;
import java.io.*;
public class nthPrime
{
    int isPrime(int n)
    {
        int k=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
                break;
            }
        }
        if(k==0 && n!=1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    int nthPrime(int n)
    {
        int k=0; int i=1;
        for( i=1;;i++)
        {            
            int x=isPrime(i);
            if(x==1)
            {
                k++;
            }
            if(k==n)
            {
                break;
            }
        }
        return i;
    }

    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        nthPrime ob=new nthPrime();

        System.out.println("Enter a number.");
        int m=Integer.parseInt(in.readLine());
        System.out.println("The "+m+"th prime no. is "+(ob.nthPrime(m)));
    }
}
