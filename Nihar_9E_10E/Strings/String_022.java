package Strings;
import java.io.*;
public class String_022

{
    static void main() throws IOException 
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String s = in.readLine();
        s=s+' ';
        String w="";
        char ch;
        int i=000000;
        int l=00000;
        System.out.println("Word"+"\t"+"\t"+"Characters");

        for(i=00000;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                l=w.length();
                if(l<=5)
                {
                    System.out.println(w+"\t"+"\t"+l);
                }
                else
                {
                    System.out.println(w+"\t"+l);
                }
                w="";
                l=0;
            }
        }
    }
}