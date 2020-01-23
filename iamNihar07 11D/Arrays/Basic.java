package Arrays;
import java.io.*;
/**
 * WAP to accept 10int in SDA. Calc and disp sum and avg
 */
public class Basic
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        int a[]=new int[10]; 
        int s=0;
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=Integer.parseInt(in.readLine());
        }
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        System.out.println("The sum is "+s);
        System.out.println("The average is "+((double)s/10));
    }
}