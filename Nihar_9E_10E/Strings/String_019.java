package Strings;
import java.io.*;
public class String_019 //unique string
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String x = in.readLine();        
        String s = x.toLowerCase();
        s=s+' ';
        String w="";
        int k=0;
        char ch;
        char ch1=0; 
        for(int i=0; i<s.length(); i++)
        { 
            ch = s.charAt(i);          
            ch1=x.charAt(i+1);
            if(ch==ch1)
            {
                k++;
            }
        }
        if(k==0)
        {
            System.out.println("Unique String "+x);
        }
        else
        {
            System.out.println("Not Unique. "+x);
        }
    }
}

          