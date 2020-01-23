package Functions;
import java.io.*;
public class Function_05 //using ISR BR int a&b as global variable
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int a,b;
    static void main()throws IOException
    {
        Function_05 obj=new Function_05();
        obj.input();
        System.out.println("BYE");

    }

    void input() throws IOException
    {
        
        System.out.println("Enter a and b");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        addfun();
        System.out.println("OK");
    }

    void addfun()
    {
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }
}


