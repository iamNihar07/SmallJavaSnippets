package Functions;
import java.io.*;
public class Function_08
{
    static int k=0;
    boolean check(String x, char c)
    {
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch==c || ch==(ch+32)|| ch==(ch-32) )
            {
                k++;
            }
        }
        if(k>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void main()throws IOException
    {
        InputStreamReader read= new InputStreamReader (System.in);
        BufferedReader in= new BufferedReader(read);
        Function_08 ob = new Function_08();
        System.out.println("Enter a String.");
        String y=in.readLine();
        System.out.println("Enter a char.");
        char d=in.readLine().charAt(0);
        boolean flag=ob.check(y,d);
        
        if(flag==true)
        {
            System.out.println(d+" present in "+y);
            System.out.println(d+" present "+k+" no. of times.");
        }
        else
        {
            System.out.println(d+" not present in "+y);
        }
    }
}
