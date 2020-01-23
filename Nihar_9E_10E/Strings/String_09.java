package Strings;
import java.io.*;
public class String_09//making a palindrome string
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String s = in.readLine();
        String h = "";
        for(int i=0; i<s.length(); i++)
        { 
            char ch = s.charAt(i);
            h = ch + h;
        }
        String x=s+h;
        System.out.println("THE NEW PALINDROME is "+x);
    }
}
