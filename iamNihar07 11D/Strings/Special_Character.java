package Strings;
import java.io.*;
/**
 * Displaying no. of Special characters
 */
public class Special_Character
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        int k=0;
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(Character.isLetterOrDigit(ch))&& !(Character.isWhitespace(ch)))
            {
                k++;
            }
        }
        System.out.println("No. of special characters= "+k);
    }
}