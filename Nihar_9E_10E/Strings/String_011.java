package Strings;

import java.io.*;
public class String_011
{
    static void main() throws IOException //alphabetical order
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a string");
        String x = in.readLine();
        x = x.toUpperCase();

        for( int i=65; i<=90; i++)
        {
            for( int j=0; j<x.length(); j++)
            {
                char ch = x.charAt(j);
                if(ch==(char)i)
                {
                    System.out.println(ch);
                }
            }
        }
    }
}