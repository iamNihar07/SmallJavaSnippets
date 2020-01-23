package PRACT;
import java.io.*;
public class TwinPrime
{    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=0,n=0,k=0,j=0;                 
        boolean flag1=false,flag2=false;
        System.out.println("Enter a no.");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter a no.");
        int b=Integer.parseInt(in.readLine());

        if(a-b==2||a-b==-2)
        {
            for(i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    flag1=true;
                    break;
                }
            }
            for(j=2;j<b;j++)
            {
                if(b%j==0)
                {
                    flag2=true;
                    break;
                }
            }
            if(flag1==false && flag2==false)
            {
                System.out.println("Twin primes");
            }
            else
            {
                System.out.println("Twin pRimes");
            }
        }
        else
        {
            System.out.println("Not twin prime.");
        }
    }
}

       