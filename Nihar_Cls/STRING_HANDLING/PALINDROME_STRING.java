package STRING_HANDLING;
import java.io.*;
public class PALINDROME_STRING

{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        
        System.out.println("Enter a String");
        String s = in.readLine();

        int i=0;
        char ch;
        int l=s.length();
        String a = "";

        for(i=0; i<l; i++)
        {  
            ch=s.charAt(i);
            a=ch+a;
        }
        if(s.equalsIgnoreCase(a))
        { System.out.println(s+" is a palindrome word.");
        }
        else
        { 
            System.out.println(s+" isnt a palindrome word.");
        }
    }
}


