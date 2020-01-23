package Arrays;
import java.io.*;
public class Array_09
{
    static void main() throws IOException //Selection Sort Ascending
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int a[]=new int[5];  int temp =0,min=0;

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(5-i)+" Integers.");
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=0;i<a.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println("The array is - ");
            System.out.println(a[i]);
        }
    }
}

        
        