package Strings;
import java.io.*;
public class String_03 //no of words
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter your String.");
        String k = in.readLine();
        int l=0;
        String s = k.trim();
        for(int i=0; i<s.length(); i++)
        { char ch = s.charAt(i);
          if(Character.isWhitespace(ch))
          { 
              l++;
            }
        }
        System.out.println("The no of words in the string is "+(l+1));
    }
}
             