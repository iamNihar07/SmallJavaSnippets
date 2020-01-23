package Strings;

import java.io.*;
public class String_010
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        int i=0; int x=0;     
        System.out.println("Enter your String.");
        String name = in.readLine();
        name=' '+name;
        int p=name.length();
        String a="";
        char h;
        
        for(i=0;i<p;i++)
        {
            char ch=name.charAt(i);
            if(ch==' ')
            {
                a=a+name.charAt(i+1);
            }
        }
        System.out.println("Initials "+a);
    }
}
        

        
                

        
        