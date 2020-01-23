package Strings;
import java.io.*;

/**
 * WAP to accept a string. Frequency of the alphabet 'A' or 'a'
 */
public class FreqOfAa
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine();
        int k=0;
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='A' )
            {
                k++;
            }            
        }
        System.out.println("Frequency "+k);     
    }   
}

