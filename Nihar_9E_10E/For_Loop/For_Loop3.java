package For_Loop;
import java.io.*;
public class For_Loop3
{   void main()throws IOException
    {  InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double i = 0;
        double a=0;
        double s=0;
        System.out.println("Enter the value of a");
        a = Integer.parseInt(in.readLine());
        for ( i=0;i<=10; i++) // to find out sum of 1+a raised to 1 + a raised to 2 + till 10
        { a=Math.pow(a,i);
          s = s + a ; }
        System.out.println("The sum is "+s);
    }
}
