package STRING_HANDLING;
import java.io.*;
public class Extracting_first_word
{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();
        s=s+"";
        int l=s.length();

        int i=0;
        char ch;
        
        
        String s2="";

        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s2=s2+ch;
            }
            else
            {
                System.out.println(s2);
            }
        }
    }
}
