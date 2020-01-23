package Functions;
import java.io.*;
/**
 * Pallindrome word
 */
public class LongestPalWord
{
    void LongPalin(String s)
    {
        String w="",a="",maxword="";
        int maxlength=0; String rw="";
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
                if(w.equalsIgnoreCase(rw))
                {                 

                    if(w.length()>maxlength)
                    {
                        maxlength=w.length();
                        maxword=w;
                    }    
                }
                w="";
                rw="";
            }
        }
        System.out.println("The longest word is "+maxword);
        System.out.println("The length of the longest word is "+maxlength);
    }

    static void main()throws IOException
    {        
        LongestPalWord ob=new LongestPalWord();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine()+" ";   
        ob.LongPalin(s);
    }
}