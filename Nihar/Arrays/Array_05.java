package Arrays;
import java.io.*;
public class Array_05
{
    static void main() throws IOException //sequential sorting integers ascending
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int a[]=new int[5];  int temp=0;      

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(5-i)+" numbers.");
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
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


        

        

        