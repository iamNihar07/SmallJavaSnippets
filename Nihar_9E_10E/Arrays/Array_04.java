package Arrays;
import java.io.*;
public class Array_04
{
    static void main() throws IOException //sum of odd and even nos
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" values");
            a[i]=Integer.parseInt(in.readLine());
        }

        int se=0,so=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                se=se+a[i];
            }
            else
            {
                so=so+a[i];
            }
        }

        System.out.println("Sum of odd nos = "+so+" & sum of even nos = "+se);
    }
}
