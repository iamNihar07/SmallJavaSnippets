package STRING_HANDLING;
import java.io.*;
public class Replace_Command_ignorecase
{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a string");
        String s =in.readLine();

        System.out.println(s.replace("RED","GREEN"));
    }
}

