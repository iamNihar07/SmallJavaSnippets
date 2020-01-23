package Strings;
import java.io.*;
/**
 * replacing first letter with x
 * replacing vowels with x
 */
public class Replace_x
{
    static void main1()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        s=" "+s;

        for(int i=0; i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s=s.replace(s.charAt(i+1),'x');
            }
        }
        System.out.println(s.trim());
    }
    static void main2()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        s=" "+s;

        for(int i=0; i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                s=s.replace(s.charAt(i),'x');
            }
        }
        System.out.println(s.trim());
    }
    
}