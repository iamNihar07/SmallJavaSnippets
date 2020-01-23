package Arrays;
import java.io.*;
public class Array_08
{
    static void main() throws IOException //sequential sorting strings descending
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        String a[]=new String[5];  String temp="";      

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(5-i)+" Strings.");
            a[i]=(in.readLine());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareToIgnoreCase(a[j])<0)
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


        

        

        