package Arrays;
import java.io.*;
public class Array_12
{
    static void main() throws IOException //Bubble Sort Descending
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
            for(int j=0;j<(a.length-1-i);j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println("The array is - ");
            System.out.println(a[i]);
        }
    }
}

        