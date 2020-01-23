package Strings;
import java.io.*;
public class String_04 //for checking vowels.
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter your String.");
        String x = in.readLine();
        int k=0;
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
                 k++;
                }
        }
        System.out.println("No. of Vowels is "+k);
    }
}
             