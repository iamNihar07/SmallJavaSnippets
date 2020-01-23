package Functions;
import java.io.*;
public class XYZ
{
    static boolean zyx(String s)
    {
        if(s.equalsIgnoreCase("true"))
        {
            return true;
        }
        else if(s.equalsIgnoreCase("false"))
        {
            return false;
        }        
    }

    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in =new BufferedReader(read);
        System.out.println("Enter true or false for Boolean.");
        String s=in.readLine();
        boolean flag=zyx(s);
        System.out.println(flag);
    }
}
