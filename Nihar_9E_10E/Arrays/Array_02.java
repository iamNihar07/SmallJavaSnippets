package Arrays;
import java.io.*;
public class Array_02
{
    static void main() throws IOException //finding min and max of an array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" values");
            a[i]=Integer.parseInt(in.readLine());
        }
        int max=a[0],min=a[0];

        for(int i=0;i<a.length;i++)
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

        System.out.println("The max no is "+max+" & the min no is "+min);
    }
}