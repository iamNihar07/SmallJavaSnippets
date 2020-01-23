package Arrays;
import java.io.*;
public class Array_08 //displaying no. of elements with even no. of words
{
    static void main() throws IOException 
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[10];
        int i=0,l; String w="";

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" names");
            a[i]=in.readLine();
        }

        System.out.println("The names having even no. of alphabets in the array are ");

        for(i=0;i<a.length;i++)
        {
            w=a[i];
            l=w.length();
            if(l%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
