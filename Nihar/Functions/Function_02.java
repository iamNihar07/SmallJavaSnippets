package Functions;
import java.io.*;
public class Function_02
{
    static void main()throws IOException //pure function finding square
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a.");
        int a=Integer.parseInt(in.readLine());

        int ans=square(a);
        System.out.println("Square of "+a+" is "+ans);
        
    }

    static int square(int a)
    {
        int sq=a*a;
        return sq;
    }
}

