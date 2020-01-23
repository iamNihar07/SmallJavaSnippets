package Class_Progs;
import java.io.*;
public class Amicable
{
    InputStreamReader read=new InputStreamReader (System.in);
    BufferedReader in=new BufferedReader(read);
    int x,y;
    void accept() throws IOException
    {
        System.out.println("Enter the first no.");
        x=Integer.parseInt(in.readLine());        
        System.out.println("Enter the second no.");
        y=Integer.parseInt(in.readLine());
    }

    boolean check()
    {
        int sum1=0,sum2=0;
        
        System.out.print("Factors of "+x+" : ");
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                System.out.print(i+" ");
                sum1=sum1+i;
            }
        }
        System.out.println();
        System.out.println("Sum of factors "+sum1);

        System.out.print("Factors of "+y+" : ");
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            {
                System.out.print(i+" ");
                sum2=sum2+i;
            }
        }
        System.out.println();
        System.out.println("Sum of factors "+sum2);
        if(sum1==sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void main() throws IOException
    {
        Amicable ob=new Amicable();
        ob.accept();
        boolean flag=ob.check();
        if(flag==true)
        {
            System.out.println("Amicable pair.");
        }
        else
        {
            System.out.println("Non-Amicable pair.");
        }
    }
}

        
