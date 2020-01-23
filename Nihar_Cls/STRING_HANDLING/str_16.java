package STRING_HANDLING;
import java.io.*;
public class str_16
{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();
        s=s+"";
        int l=s.length();

        int i=0,l2,max=0,lword;
        char ch;

        String s3="";
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
                l2=s2.length();
                if(l2>max)
                {
                    lword=l2;
                    max=l2;
                }
                s2="";
            }
        }
    }
}
    
