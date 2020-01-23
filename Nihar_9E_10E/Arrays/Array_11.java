package Arrays;
import java.io.*;
public class Array_11
{
    static void main() throws IOException //cricketer and centuries
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[10];
        int b[]=new int[10];
        int i=0;

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter the name of cricketers "+(10-i));
            a[i]=in.readLine();
            System.out.println("Enter the centuries scored "+(10-i));
            b[i]=Integer.parseInt(in.readLine());
        }

        int max=b[0];
        String q="";

        for(i=0;i<a.length;i++)
        {
            if(b[i]>max)
            {
                max=b[i];
                q=a[i];
            }
        }       
        System.out.println("Cricketer "+q+" has scored the most no of centuries - "+max);
               
        
    }
}

