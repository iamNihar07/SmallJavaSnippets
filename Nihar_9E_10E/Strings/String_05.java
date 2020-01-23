package Strings;
import java.io.*;
public class String_05//checking for palindrome string
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
        if(h.equalsIgnoreCase(s))
        { 
            System.out.println(s+" is a Palindrome String");
        }
        else
        {
            System.out.println(s+" isnt a Palindrome String.");
        }
    }
}