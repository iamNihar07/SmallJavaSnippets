package If_Condition;
import java.io.*;
public class IF_16
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int m=0;
        System.out.println("ENTER MARKS");
        m=Integer.parseInt(in.readLine());
         if(m>=0 && m<41)
        {
            System.out.println("F");
        }
        else if (m>40 && m<56)
        {
            System.out.println("C");
        }
        else if(m>55 && m<61)
        {           
            System.out.println("B");
        }
        else if(m>60 && m<76)
        {
            System.out.println("B+");
        }
         else if(m>75 && m<81)
        {
            System.out.println("A");
        }
         else if(m>80 && m<101)
        {
            System.out.println("A+");
       }        
        else
        {
            System.out.println("WRONG INPUT");
            
        }
      
    }
}