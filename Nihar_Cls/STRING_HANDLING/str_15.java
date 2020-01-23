package STRING_HANDLING;
import java.io.*;
public class str_15
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

        s="";
        String s2="";

        for(l=1; i<l; i--)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s2=ch+s2;
            }
            else{
                System.out.println(s2);
                s2="";
            }
        }
    }
}
