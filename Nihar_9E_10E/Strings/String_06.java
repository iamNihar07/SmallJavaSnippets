package Strings;
import java.io.*;
public class String_06//checking the upper lower case or digits or special characters
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String s = in.readLine();
        int i=0;
        int k=0,l=0,m=0,n=0;

        for(i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                k++;
            }
            else if(Character.isLowerCase(ch))
            {
                l++;
            }
            else if(Character.isDigit(ch))
            {
                m++;
            }
            else
            {
                n++;
            }
        }
        System.out.println("The no. of Upper case characters is "+k);
        System.out.println("The no. of Lower case characters is "+l);
        System.out.println("The no. of Digit characters is "+m);
        System.out.println("The no. of Special characters is "+n);
    }
}

           