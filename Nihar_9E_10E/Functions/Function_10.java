package Functions;
import java.io.*;
public class Function_10
{

    void calc(int num,char ch)
    {
        int n=0;
        if(ch=='s')
        {
            n=num*num;
        }
        else
        {
            n=(int)Math.pow(num,3);
        }
        System.out.println(n);
    }

    void calc(int a,int b,char ch)
    {
        int n=0;
        if(ch=='p')
        {
            n=a*b;
        }
        else
        {
            n=a+b;
        }
        System.out.println(n);
    }

    void calc(String s1,String s2)
    {
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings not equal");
        }
    }

    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Function_10 ob=new Function_10();
        System.out.println("Enter a number");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter a char.");
        char c=in.readLine().charAt(0);
        ob.calc(a,c);

        System.out.println("Enter two nos.");
        int b=Integer.parseInt(in.readLine());
        int d=Integer.parseInt(in.readLine());
        System.out.println("Enter a char.");
        char ch1=in.readLine().charAt(0);
        ob.calc(b,d,ch1);

        System.out.println("Enter 2 Strings.");
        String e=in.readLine();
        String f=in.readLine();
        ob.calc(e,f);
    }
}

    