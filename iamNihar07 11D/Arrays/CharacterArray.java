package Arrays;
import java.io.*;
/**
 * WAP to accept 10int in SDA. Disp words ending beginning with same
 */
public class CharacterArray
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);    

        System.out.println("Enter a string");
        String s=in.readLine();
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i);
        }
        char temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-i-1);j++)
            {
                if(a[j]>a[j+1])
                {
                    temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
