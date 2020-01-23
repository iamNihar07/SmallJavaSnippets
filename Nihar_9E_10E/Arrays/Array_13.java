package Arrays;
import java.io.*;
public class Array_13
{
    static void main() throws IOException //name and telephone
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[10];
        int b[]=new int[10];
        int i=0;

        for(i=0;i<a.length;i++)
        {
            System.out.print((i)+".");
            System.out.println(" Enter the name ");
            a[i]=in.readLine();
            System.out.println("Enter the telephone nos. ");
            b[i]=Integer.parseInt(in.readLine());
        }

        boolean flag = false;
        System.out.println("Enter the name'''");
        String s=in.readLine();

        for(i=0;i<a.length;i++)
        {
            if(s.equalsIgnoreCase(a[i]))
            {
                flag=true;
                break;
            }
        }       

        if(flag==true)
        {
            System.out.println("Search Successful.");
            System.out.println(a[i]+" - "+b[i]);
        }
        else
        {
            System.out.println("Search Unsuccessful.");
        }         
    }
}

