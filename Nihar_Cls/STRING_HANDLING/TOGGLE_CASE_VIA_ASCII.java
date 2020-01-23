package STRING_HANDLING;
import java.io.*;
public class TOGGLE_CASE_VIA_ASCII
{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();

        int i=0;
        char ch;
        int l=s.length(),sc=0;
        String st="";
        
        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            {
                
                st=st+((char)(ch+32));
            }
            else if(ch>=97 && ch<=122)
            {
                
                st=st+((char)(ch-32));
            }
            else
            {
                st=st+ch;
            }
        }
        System.out.println(s);
        System.out.println(st);
       
    }
}