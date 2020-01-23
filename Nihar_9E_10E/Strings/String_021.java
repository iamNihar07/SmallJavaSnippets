package Strings;
import java.io.*;
public class String_021

{
    static void main() throws IOException //piglatin
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String x = in.readLine();
        String x2="";
        String x3="";
        String x4="";
        
        for(int i=0; i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch=='a' || ch=='A' ||
            ch=='e' || ch=='E' ||
            ch=='i' || ch=='I' ||
            ch=='o' || ch=='O' ||
            ch=='u' || ch=='U')
            {
                x2=x.substring(0,i);
                x3=x.substring(i);
                x4=x3+x2+"ay";
                break;
            }
        }
        System.out.println("Pig latin word of "+x+" is "+x4);
    }
}
            
    