package STRING_HANDLING;
import java.io.*;
public class TRIM
{
  static void main()throws IOException
  {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      
      System.out.println("Enter a string");
      String x = in.readLine();
      
      System.out.println("Enter another string");
      String y = in.readLine();
      
      System.out.println(x+y);
      System.out.println(x.trim()+y.trim());
      System.out.println((x+y).trim());
    }
}