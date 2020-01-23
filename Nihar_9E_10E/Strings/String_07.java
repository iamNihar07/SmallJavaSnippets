package Strings;
import java.io.*;
public class String_07//converting Uppercase vowels into Lowercase
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String s = in.readLine();
        int i=0;
        String q="";

        for(i=0;i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                char a=Character.toLowerCase(ch);
                q = q+a;
            }
            else
            {
                q=q+ch;
            }
        }
        System.out.println("Original String = "+s);
        System.out.println("New String = "+q);
    }
}