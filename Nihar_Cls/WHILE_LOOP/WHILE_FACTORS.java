package WHILE_LOOP;
import java.io.*;
public class WHILE_FACTORS
{
    static void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
