package WHILE_LOOP;
import java.io.*;
public class WHILE_DUCK_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int s=0; int m=n; int r; boolean flag=false;
        while(n!=0)
        {
            r=n%10;
            if(r==0)
            {
                flag=true;
                break;
            }
            n=n/10;
        }
        if(flag=true)
        {
            System.out.println("not a DUCK NO.");
        }
        else
        {
            System.out.println("DUCK No.");
        }
    }
}
