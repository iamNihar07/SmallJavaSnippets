package Strings;

import java.io.*;
public class String_016 //reversing each word of a string
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
        String y="";
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
                for(int j=0;j<a.length();j++)
                {
                    ch1=a.charAt(j);
                    y=ch1+y;
                }
                System.out.print(y+' ');
                y="";
            }
        }
    }
}

            