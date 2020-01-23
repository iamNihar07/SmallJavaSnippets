package Functions;
import java.io.*;
/**
 * Toggle Case
 */
public class ToggleCase
{
    void check(String x)
    {
        String w="";
        for(int i=0; i<x.length();i++)
        {
            char ch=x.charAt(i);
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
    static void main()throws IOException
    {
        ToggleCase ob=new ToggleCase();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        ob.check(s);
    }
}
        
    