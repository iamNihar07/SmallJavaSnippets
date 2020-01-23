package STRING_HANDLING;
import java.io.*;
public class SPECIAL_CHARACTERS

{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();

        int i=0;
        char ch;
        int l=s.length(),sc=0;

        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if((Character.isLetterOrDigit(ch))==false)

            { 
                sc++;
            }
        }
        System.out.println("No. of special Characters"+sc);
    }
}