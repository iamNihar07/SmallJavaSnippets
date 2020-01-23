package STRING_HANDLING;
import java.io.*;
public class STRING_LENGTH
{
    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();

        System.out.println("String is "+s);
        System.out.println(s.length()+" is its Length");

    }
}