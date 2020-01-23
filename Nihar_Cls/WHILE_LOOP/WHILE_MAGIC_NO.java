package WHILE_LOOP;
import java.io.*;
public class WHILE_MAGIC_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int s; int m=n; int r=0; 
        while(n>9)
        {
            s=0;
            while(n!=0)
            {
                r=n%10;
                s=s+r;
                n=n/10;
            }
            n=s;
        }

        if(n==1)
        {
            System.out.println("MAGIC NO.");
        }
        else
        {
            System.out.println("NOT MAGIC NO.");
        }
    }
}
