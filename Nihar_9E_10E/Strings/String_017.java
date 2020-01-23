package Strings;

import java.io.*;
public class String_017 //displaying the words that begin and end with a vowel.
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
        
        char ch1,ch2;

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
                a=a.trim();
                a=a.toUpperCase();
                ch1=a.charAt(0);
                ch2=a.charAt((a.length()-1));
                if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' ||ch1=='U')&&(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' ||ch2=='U' ))  
                 {
                    System.out.print(a+' ');
                }
            }
        }
    }
}

            