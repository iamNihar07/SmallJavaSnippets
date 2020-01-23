package STRING_HANDLING;
import java.io.*;

public class EXTRACTING_first_CHARACTER_initials_reverse
{
    static void main()throws IOException
    { 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a string.");
        String s=in.readLine();
        s=' '+s+' ';
        char ch; int i=0; String s1="";
        int l=s.length();

        for(i=l-1; i>0; i--)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i+1);
            }
            
        }
        System.out.println(s1);
    }
}