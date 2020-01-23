package WHILE_LOOP;
import java.io.*;
public class WHILE_PERFECT_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int s=0;
        while(i<n)
        {
            if(n%i==0)
            {
                s=s+i;
            }
            i++;
        }
        if(s==n)
        {
            System.out.println("PERFECT NO.");
        }
        else
        {
            System.out.println(" NOT PERFECT NO.");
        }
    }
}
