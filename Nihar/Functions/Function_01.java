package Functions;
import java.io.*;
public class Function_01
{
    void main()throws IOException //impure function using a & b
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a.");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter b.");
        int b=Integer.parseInt(in.readLine());

        addfun(a,b);
    }

    void addfun(int a,int b)
    {
        int sum=0;
        sum=a+b;
        System.out.println("Sum of numbers = "+sum);
    }
}

