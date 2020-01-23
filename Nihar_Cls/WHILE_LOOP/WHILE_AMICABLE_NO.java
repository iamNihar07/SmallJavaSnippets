package WHILE_LOOP;
import java.io.*;
public class WHILE_AMICABLE_NO
{
    void main() throws IOException
    {
        
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int m=Integer.parseInt(in.readLine());
        
        int i=1,a=0,s1=0,s2=0;
        
        while(i<n)
        {
            if(n%i==0)
            {
                s1=s1+i;
                 System.out.println(i);
            }
            i++;
        }
         System.out.println("SUM OF FACTORS OF "+n+" = "+s1);
        
        i=1;
        while(i<m)
        {
            if(m%i==0)
            {
                s2=s2+i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("SUM OF FACTORS OF "+m+" = "+s2);

        if(n==s2 && m==s1)
        {
            System.out.println("AMICABLE");        
        }
        else
        {
            System.out.println("NOT AMICABLE NO.");
        }
    }
}
