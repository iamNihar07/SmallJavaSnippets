package Strings;
import java.io.*;
/**
 *WAP to accept a string and display initials
 */
public class Initials2
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s =in.readLine();
        s=" "+s.trim();

        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(s.charAt(i+1));
            }
        }
    }
}