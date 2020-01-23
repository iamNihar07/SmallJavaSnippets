package Functions;
import java.io.*;
public class SumOfSquares
{
    int sq(int x)
    {
        int a=0,s=0;
        while(x!=0)
        {
            a=x%10;
            s=s+(a*a);
            x=x/10;
        }
        return s;
    }
    static void main()throws IOException
    {
        SumOfSquares ob =new SumOfSquares();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int n1=ob.sq(n);
        System.out.println("Sum of squares= "+n1);
    }
}
