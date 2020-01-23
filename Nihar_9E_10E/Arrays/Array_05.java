package Arrays;
import java.io.*;
public class Array_05
{
    static void main() throws IOException //searching word in an arrray
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[5];
        int i=0;

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(5-i)+" names");
            a[i]=in.readLine();
        }

        System.out.println("Enter the name to be searched for");
        String x=in.readLine();
        boolean flag=false;

        for(i=0;i<a.length;i++)
        {
            if(a[i].equalsIgnoreCase(x))
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("Name found at position "+(i+1));
        }
        else
        {
            System.out.println("Name not found.");
        }
    }
}
    

