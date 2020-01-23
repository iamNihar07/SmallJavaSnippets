package STRING_HANDLING;
import java.io.*;
public class UPPER_AND_LOWER
{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        
        System.out.println("Enter a String");
        String s = in.readLine();

        String s2=s.toUpperCase();
        String s3=s.toLowerCase();
        
        System.out.println(s2);
        System.out.println(s3);
    }
}