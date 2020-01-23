package Strings;
import java.io.*;
/**
 * Pallindrome word
 */
public class Pallindrome
{
    static void main()throws IOException
    {
        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine()+" ";
        System.out.println("The pallindrome words are: ");
        String w="",rw="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
                rw=ch+rw;
            }
            else
            {
                if(w.equalsIgnoreCase(rw) && w.length()>1)
                {
                    System.out.println(w);
                }
                w="";
                rw="";
            }
        }
    }
}
    