package Strings;
import java.io.*;
/**
 * Freq of a word in string
 */
public class FrequencyofWord
{
    static void main()throws IOException
    {        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a string.");
        String s = in.readLine()+" ";  
        System.out.println("Enter a word.");
        String t = in.readLine();     
        String w="",a="";
        int k=0;
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
                if(a.equalsIgnoreCase(t))
                {
                    k++;                    
                }
            }
        }
        System.out.println("The freq is "+k);
    }
}