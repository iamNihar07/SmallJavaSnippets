package Strings;
import java.io.*;
public class String_020 //forming a word by extracting first and last alphabets.
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String x = in.readLine();
        x=' '+x+' ';
        String w="";
        char ch1;
        String a="";
        String s="";

        for(int i=0; i<x.length(); i++)
        { 
            char ch = x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
            }
            a=a.trim();
            for(int j=0;j<a.length();j++)
            {
                
                if(j==0)
                { 
                    ch1= a.charAt(j);
                    s=s+ch1;                    
                }
                else if(j==((a.length())-1))
                {
                    ch1= a.charAt(j);
                    s=s+ch1;                  
                }
                else
                { 
                    continue;
                }
            }
        }
        System.out.println("New string "+s);
    }
}

              
          