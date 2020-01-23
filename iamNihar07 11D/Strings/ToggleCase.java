package Strings;
import java.io.*;
/**
 * Toggle Case
 */
public class ToggleCase
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        int k=0;
        String w="";
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    ch=Character.toLowerCase(ch);
                }
                else
                {
                    ch=Character.toUpperCase(ch);
                }
            }
            w=w+ch;
        }
        System.out.println("Toggled String "+w);
    }
}
