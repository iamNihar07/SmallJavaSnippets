package Strings;

import java.io.*;
public class String_015 //displaying only the words with the vowel.
{
    static void main() throws IOException 
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter your String.");
        String x = in.readLine();
        x=x+' ';
        String a="";
        String w="";
        int z=0;
        char ch1;

        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else if(ch==' ')
            {
                a=w;
                w=""; 
                a=a.toUpperCase();
                ch1=a.charAt(0);
                if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' ||ch1=='U')
                {
                    System.out.print(a+' ');
                }
            }
        }
    }
}

            