package Arrays;
import java.io.*;
public class Stats
{
    int a[]=new int[10];
    double m;
    double sd;

    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a number.");
            a[i]=Integer.parseInt(in.readLine());
        }
    }

    double mean()
    {
        int s=0;
        for(int i=0;i<10;i++)
        {
            s=s+a[i];
        }
        m=s/10;
        return m;
    }

    void deviation()
    {
        for(int i=0;i<10;i++)
        {
            
            System.out.println("Deviation of "+i+" element= "+(m-a[i]));

        }
    }

    static void main()throws IOException
    {
        Stats ob=new Stats();

        ob.input();
        System.out.println("Mean is "+(ob.mean()));                    
        ob.deviation();
    }
}

