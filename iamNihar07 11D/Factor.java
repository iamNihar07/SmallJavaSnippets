import java.io.*;
/**Displaying factors
 * Perfect no. program
 * Prime no.
 */
public class Factor
{
    static void Factors()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Factors of "+n+" are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
    static void SumOfFactors()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        System.out.println("Sum is "+s);
    }

    static void PerfectNumber()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(n==s)
        {
            System.out.println("Perfect no.");
        }
        else
        {
            System.out.println("Not a perfect no.");

        }
    } 

    static void PrimeComposite()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        boolean flag=false;

        if(n!=1)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println("Prime no.");
            }
            else
            {
                System.out.println("Composite no.");
            }
        }
        else
        {
            System.out.println("Unique no.");
        }
    }
}

