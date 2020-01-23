package Arrays;
import java.io.*;
/**
 * WAP to accept 10int in SDA. Disp words ending beginning with same
 */
public class Words
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        String a[]=new String[10]; 

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=in.readLine();
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            String s=a[i];
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            if(c1==c2)
            {
                System.out.println(s);
            }
        }
    }
}
