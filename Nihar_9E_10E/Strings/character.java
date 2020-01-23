package Strings;
import java.io.*;
public class character
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String x = in.readLine()+" ";
        String w="",a=""; 
        int l=0; 
        char ch;
        System.out.println("Word"+"\t"+"No. of Character");
        for(int i=0; i<x.length(); i++)
        { 
            ch = x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
                l=a.length();
                System.out.println(a+"\t"+l);
            }
        }
    }
}