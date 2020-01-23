package Strings;
import java.io.*;
public class String_02 //no. of spaces
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter your String.");
        String s = in.readLine();
        int k=0;
        for(int i=0; i<s.length(); i++)
        { char ch = s.charAt(i);
          if(Character.isWhitespace(ch))
          { 
              k++;
            }
        }
        System.out.println("The no of spaces in the string is "+k);
    }
}
             