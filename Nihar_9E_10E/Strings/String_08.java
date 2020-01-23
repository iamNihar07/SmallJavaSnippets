package Strings;

import java.io.*;
public class String_08
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        int x,m,k,p;
        k=0;; x=0;
        String a = "";
        String c = "";
        String name = "";
        char ch;

        System.out.println("Enter your String.");
        name = in.readLine();
        name = ' '+name+' ';
        p=name.length();

        for(m=0;m<p;m++)
        {
            ch = name.charAt(m);
            if(ch==' ')
            {
                x=a.length();
                if(x>k)
                {
                    k=x;
                    c=a;
                }
                a=" ";
            }
            a=a+ch;
        }
        System.out.println("Length of Longest word is "+(k-2));
        System.out.println("Longest word is "+c);
    }
}

