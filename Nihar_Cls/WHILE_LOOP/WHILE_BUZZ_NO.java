package WHILE_LOOP;
import java.io.*;
public class WHILE_BUZZ_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; int s=0; int m=n; int r; boolean flag=false;
        
       
            if(n%10==7 || n%7==0)
            {
                flag=true;
                
            }
        
        
        if(flag==true)
        {
            System.out.println("BUZZ NO.");
        }
        else
        {
            System.out.println("NOT BUZZ NO");
        }
    }
}
