package PRACT;
import java.io.*;
public class TwistedPrime
{    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=0,n=0,k=0,m=0,r=0,a=0,j=0; boolean flag=false;
        System.out.println("Enter no.");
        m=Integer.parseInt(in.readLine());
        n=m;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            while(n!=0)
            {
                a=n%10;
                r=r*10+a;
                n=n/10;
            }
            for(j=2;j<r;j++)
            {
                if(r%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println("Twisted Prime.");
            }
            else
            {
                System.out.println("Not TwistedPrime.");
            }
        }
        else
        {
            System.out.println("Not twisted prime.");
        }
    }
}

        