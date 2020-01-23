package WHILE_LOOP;
import java.io.*;
public class WHILE_HCF_AND_LCM
{
    void main() throws IOException
    {
        
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int m=Integer.parseInt(in.readLine());
        
        int i=1,hcf=0,lcm=0;
        int p=(int)Math.max(n,m);
        while(i<p)
        {
            if(n%i==0 && m%i==0)
            {
                hcf=i;
               
            }
            i++;
        }
         lcm=(m*n)/hcf;
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+lcm);       
        
    }
}
