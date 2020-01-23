package Strings;
import java.io.*;
public class String_018 //replacing vowel with *
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter your String.");
        String x = in.readLine();
        String w="";
        String s = x.toLowerCase();
        for(int i=0; i<s.length(); i++)
        { 
          char ch = s.charAt(i);
          if(ch == 'a' ||
             ch == 'e' ||
             ch == 'i' ||
             ch == 'o' ||
             ch == 'u')
             {
                 ch='*';
              }
          w=w+ch;
        }
        System.out.println("String new = "+w);
    }
}
             