package Strings;
import java.io.*;

/**
 * WAP to accept a word and display the ASCII values of the alphabets
  */
public class ASCII
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine();

        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            int y=(int)ch;
            System.out.println(ch+" = "+y); 
        }
    }
}
