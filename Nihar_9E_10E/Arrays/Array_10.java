package Arrays;
import java.io.*;
public class Array_10
{
    static void main() throws IOException //state and capital
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[10];
        String b[]=new String[10];
        int i=0;

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter the State "+(10-i));
            a[i]=in.readLine();
            System.out.println("Enter the capital "+(10-i));
            b[i]=in.readLine();
        }

        System.out.println("Enter the state to display its capital");
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
            System.out.println("Capital of "+a[i]+" is "+b[i]);
        }
        else
        {
            System.out.println("Wrong country input.");
        }
    }
}
    

