package STRING_HANDLING;
import java.io.*;
public class Initials_2 //Subhash Chandra Bose = S.C.B
{
  static void main()throws IOException
  {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      
      System.out.println("Enter a string");
      String s = in.readLine();
      s=' '+s;
      int l=s.length();
      
      for(int i=0;i<l;i++)
      {
          char ch = s.charAt(i);
          if(ch==' ')
          {
              
                  System.out.print(s.charAt(i+1)+".");
                  
            }
        }
    }
}
      
      