package WHILE_LOOP;
import java.io.*;
public class WHILE_FACTORIAL
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int f=1;
        while(i<=n)
        {
            f=f*i;
           
            i++;
        }
        System.out.println("FACTORIAL OF "+n+"is"+f);
    }
}
