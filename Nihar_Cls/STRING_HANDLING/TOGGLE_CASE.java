package STRING_HANDLING;
import java.io.*;
public class TOGGLE_CASE

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
            if(Character.isUpperCase(ch))
            {
              
                st=st+Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                
                st=st+Character.toUpperCase(ch);
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