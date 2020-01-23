/**
*Sum till user enters 0
*/
import java.io.*;
public class SumTillUsersChoice
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int sum=0;
        int n=0;
        do
        {                  
            System.out.println("Enter a number.");
            n=Integer.parseInt(in.readLine()); 
            sum=sum+n;
        }while(n!=0);

        System.out.println("Sum is "+sum);
    }
}
