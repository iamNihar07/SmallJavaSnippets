/**
 *HCF LCM
 */
import java.io.*;
public class HCF_LCM
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter two factors.");
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        int hcf=0,lcm=0;
        for(int i=1;i<=(Math.min(a,b));i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        lcm=(a*b)/hcf;
        System.out.println("HCF is "+hcf);
        System.out.println("LCM is "+lcm);
    }
}