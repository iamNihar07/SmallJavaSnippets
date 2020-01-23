package STRING_HANDLING;
import java.io.*;
public class PigLatin //nihar ---> iharnay
{
  static void main()throws IOException
  {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      
      System.out.println("Enter a string");
      String s = in.readLine();
      
      String s1="";
      String s2="";
      String s3="";
      
      int l=s.length();
      for(int i=0;i<l;i++)
      {
          char ch=s.charAt(i);
          if(ch=='A' || ch=='a' || 
             ch=='E' || ch=='e' || 
             ch=='I' || ch=='i' || 
             ch=='O' || ch=='o' || 
             ch=='U' || ch=='u' )
          {
              s1=s.substring(i);
              s2=s.substring(0,i);
              s3=s1+s2+"Ay";
              break;
            }
        }
       System.out.println(s3);
    }
}