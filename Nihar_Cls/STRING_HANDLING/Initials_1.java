package STRING_HANDLING;
import java.io.*;
public class Initials_1 //Subhash Chandra Bose = S.C.Bose
{
  static void main()throws IOException
  {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      
      System.out.println("Enter a string");
      String s = in.readLine();
      s=' '+s;
      int l=s.length();
      int sp=1;
      for(int i=0;i<l;i++)
      {
          char ch = s.charAt(i);
          if(ch==' ')
          {
              if(sp==1 || sp==2)
              {
                  System.out.print(s.charAt(i+1)+".");
                  sp++;
               }
              else
              {
                  System.out.print(s.substring(i+1));
                  break;
              }
            }
        }
    }
}
      
      