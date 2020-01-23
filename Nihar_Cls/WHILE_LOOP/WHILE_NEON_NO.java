package WHILE_LOOP;
import java.io.*;
public class WHILE_NEON_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int sq=(int)Math.pow(n,2); int m=n; int a=0; int s=0;
        while(sq!=0)
        {
           a=sq%10;
           s=s+a;
           sq=sq/10;
        }

        if(n==s)
        {
            System.out.println("NEON NO.");
        }
        else
        {
            System.out.println("NOT NEON NO.");
        }
    }
}
