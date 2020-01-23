package WHILE_LOOP;
import java.io.*;
public class WHILE_AUTOMORPHIC_NO
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i=1; 
        int sq=(int)Math.pow(n,2);
        int m=n; 
        int d=0; 

        while(m!=0)
        {
            d++;
            m=m/10;
        }

        if(n==(sq%(int)(Math.pow(10,d))))
        {
            System.out.println(" AUTOMORPHIC NO.");
        }
        else
        {
            System.out.println("NOT AUTOMORPHIC NO.");
        }
    }
}
