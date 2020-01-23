package STRING_HANDLING;
import java.io.*;
public class CHARACTER_EXTRACTION

{
    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();
        

        for(int i=0; i<s.length(); i++)
        {  
            System.out.println(s.charAt(i));
        }
    }
}

   