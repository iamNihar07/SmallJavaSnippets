package Strings;
import java.io.*;
/**
 * Pallindrome word
 */
public class LongestWord
{
    static void main()throws IOException
    {        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine()+" ";        
        String w="",a="",maxword="";
        int maxlength=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
                if(a.length()>maxlength)
                {
                    maxlength=a.length();
                    maxword=a;
                }                
            }
        }
        System.out.println("The longest word is "+maxword);
        System.out.println("The length of the longest word is "+maxlength);
    }
}