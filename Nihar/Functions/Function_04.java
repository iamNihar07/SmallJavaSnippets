package Functions;
import java.io.*;
public class Function_04 //using ISR BR as global variable
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);

    static void main()throws IOException
    {
        Function_04 obj=new Function_04();
        obj.input();
        System.out.println("BYE");

    }

    void input() throws IOException
    {
        
        System.out.println("Enter a and b");
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        addfun(a,b);
        System.out.println("OK");
    }

    void addfun(int c,int d)
    {
        int sum=0;
        sum=c+d;
        System.out.println("Sum is "+sum);
    }
}


