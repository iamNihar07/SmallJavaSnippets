package STRING_HANDLING;
import java.io.*;

public class EXTRACTING_WORDS
{
    static void main()throws IOException
    { 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a string.");
        String s=in.readLine();
        s=s+' ';
        char ch; int i=0; String s1="";

        for(i=0; i<s.length(); i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
            }
            else
            {
                System.out.println(s1);
                s1="";
            }
        }
    }
}
      

    
                
            
