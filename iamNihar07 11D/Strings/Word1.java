package Strings;
import java.io.*;
/**
 * Display each word and its length only if the word ends with a vowel.
 */
public class Word1
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String.");
        String s = in.readLine();
        s=s+" ";
        String w="",a="";
        
        System.out.println("Word \t Length");
        for(int i=0; i<s.length();i++)
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
                char ch1=a.charAt(a.length()-1);
                if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || 
                ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
                {
                    System.out.println(a+"\t"+a.length());
                }
            }
        }
    }
}
