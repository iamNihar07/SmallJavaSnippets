package STRING_HANDLING;
import java.io.*;
public class str_17
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

        String s3="";
        String s2="";

        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s2=s2+ch;
                s3=ch+s3;
            }

            else {  
                if(s2.equals(s3))
                {    
                    System.out.println();
                    s2="";
                    s3="";
                }
            }
        }
    }
}
