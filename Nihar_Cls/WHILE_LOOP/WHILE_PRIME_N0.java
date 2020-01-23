package WHILE_LOOP;
import java.io.*;
public class WHILE_PRIME_N0
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=2; int k=0;
        while(i<n)
        {
            if (n%i==0)
            {
                k++;
                break;
            }
           
            i++;
        }
        if(k==1)
        {
            System.out.println("NOT PRIME");
        }
        else 
        {
            System.out.println("PRIME");
        }
    }
}
