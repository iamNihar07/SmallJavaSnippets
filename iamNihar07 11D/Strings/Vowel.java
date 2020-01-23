package Strings;
import java.io.*;
/**
 *WAP to accept a string and calc total no of vowels
  */
public class Vowel
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
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                k++;
            }            
        }
        System.out.println("No of vowels "+k);        
    }
}
