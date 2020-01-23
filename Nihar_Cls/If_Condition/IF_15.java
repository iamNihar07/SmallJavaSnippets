package If_Condition;
import java.io.*;
public class IF_15
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a=0,b=0,c=0;
        System.out.println("ENTER 3 SIDES");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        if(a+b>c && a+c>b && b+c>a)
        {
           System.out.println("TRIANGLE IS POSSIBLE");
  
        }
        else
        {
             System.out.println("TRIANGLE IS NOT POSSIBLE");
        }
    }
}