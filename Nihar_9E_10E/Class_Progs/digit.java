package Class_Progs;
import java.io.*;
public class digit
{
    static int num;
    void accept()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number.");
        num=Integer.parseInt(in.readLine());
    }

    int lastdigit()
    {
        int m=num;
        int ld=m%10;
        return(ld);
    }

    int reverse()
    {
        int m=num;
        int a=0,nn=0;
        while(m!=0)
        {
            a=m%10;
            nn=nn*10+a;
            m=m/10;
        }
        return(nn);
    }

    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        digit ob=new digit();
        ob.accept();
        int lastdigit1=ob.lastdigit();
        int reversedno=ob.reverse();
        System.out.println("Last digit- "+lastdigit1);
        System.out.println("Reversed no.- "+reversedno);
    }
}