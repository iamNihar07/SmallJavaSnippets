package Strings;

import java.io.*;
public class String_012
{
    static void main() throws IOException 
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter your String.");
        String x = in.readLine();
        String a="";
        char ch1=0;

        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch1=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                ch1=Character.toUpperCase(ch);
            }
            else
            {
                break;
            }
            a=a+ch1;
        }

        System.out.println("New String - "+a);
    }
}
