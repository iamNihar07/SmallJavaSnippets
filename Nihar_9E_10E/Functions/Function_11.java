package Functions;
import java.io.*;
public class Function_11
{
    long fact(long x)
    {
        long f=1;
        long sf=1;
        long t=x;
        long a=0;

        while(t!=0)
        {
            a=t%10;
            for(int i=1;i<=f;i++)
            {
                f=f*i;
            }
            sf=sf+f;
            t=t/10;

        }
        return sf;
    }

    void display() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a no.");
        long n=Long.parseLong(in.readLine());
        long fs=fact(n);
        if(n==fs)
        {
            System.out.println("Krishnamurty / Special no.");
        }
        else
        {
            System.out.println("Not Krishnamurth / Special no.");
        }
    }
    static void main()throws IOException
    {
        Function_11 ob=new Function_11();
        ob.display();
    }
}


    