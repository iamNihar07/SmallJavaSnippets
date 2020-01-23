package Functions;
import java.io.*;
public class Function_03
{
    static void main()throws IOException //pure function using object
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Function_03 obj=new Function_03();
        
        System.out.println("Enter a.");
        int a=Integer.parseInt(in.readLine());

        int ans=obj.square(a);
        System.out.println("Square of "+a+" is "+ans);
        
    }

    int square(int a)
    {
        int sq=a*a;
        return sq;
    }
}

