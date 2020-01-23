package For_Loop;
import java.io.*;
public class For_Loop8
{   public static void main()throws IOException //calculate factorial
    {InputStreamReader read=new InputStreamReader(System.in);
     BufferedReader in=new BufferedReader(read);
     System.out.println("Enter a Number");
     int x=Integer.parseInt(in.readLine());
     int i=1;
     int p=1;
     
     for ( i=1;i<=x; i++)
            {
                p=p*i;
            }   
     System.out.println("The Factorial of "+x+" is "+p);
     }
    }