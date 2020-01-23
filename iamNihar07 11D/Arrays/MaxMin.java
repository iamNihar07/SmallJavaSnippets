package Arrays;
import java.io.*;
/**
 * WAP to accept 10int in SDA. Calc and disp max min
 */
public class MaxMin
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        int a[]=new int[10];        
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=Integer.parseInt(in.readLine());
        }
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}