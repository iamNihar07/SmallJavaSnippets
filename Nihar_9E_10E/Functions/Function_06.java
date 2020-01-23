package Functions;

import java.io.*;

public class Function_06 //?
{
    static String reverse(String x) 
    {
        String w="";
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            w=ch+w;
        }
        return w;
    }

    static void main()throws IOException 
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a String");
        String s=in.readLine(); 
        String reverse=reverse(s); 
        if(reverse.equalsIgnoreCase(s))
        {
            System.out.println("Pallindrome.");
        }
        else
        {
            System.out.println("Not Pallindrome.");
        }
    }            
}

