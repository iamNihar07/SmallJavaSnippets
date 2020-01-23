package Strings;

import java.io.*;
public class String_014
{
    static void main() throws IOException 
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter your String.");
        String x = in.readLine();
        x=' '+x+' ';
        String a="";
        String w="";
        int z=0;

        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if(ch!=' ')
            { 
              if(z==2)
                {
                    w="";
                }
              else
                {
                    w=w+ch;
                    
                }                           
            }
            if(ch==' ')
                {
                   z++;
                   a=a+" "+w;   
                }
        }
        System.out.println("The new String is "+a);
    }
}