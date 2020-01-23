package Strings;
import java.io.*;
public class String_023
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String s = in.readLine();
        int k=0;
        String w="",h="",a="",c="";
        char ch,ch1; int x=0;
        for(int i=0; i<s.length(); i++)
        { 
            ch = s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
                for(int j=0;j<a.length();j++)
                {
                    ch1=a.charAt(j);
                    h=ch1+h;
                }
                if(h.equalsIgnoreCase(a))
                {
                    x=a.length();
                    if(x>k)
                    {
                        k=x;
                        c=a;
                    }
                    a="";
                    h="";
                }
            }
        }
        System.out.println("The largest pallindrome word is "+c);
        System.out.println("The length is "+k);
    }
}

                 
        
        