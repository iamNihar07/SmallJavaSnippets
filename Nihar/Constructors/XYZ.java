package Constructors;
import java.io.*;
public class XYZ
{
    public void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);

        int a,b;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());

        Const2 nd = new Const2(a,b);
        //you.rect();
        nd.display();
    }
}
