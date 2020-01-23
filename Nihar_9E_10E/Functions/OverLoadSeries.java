package Functions;
import java.io.*;
public class OverLoadSeries
{
    void series()
    {
        int s=0,s1=0,s2=0;
        for(int i=2;i<=18;i+=4)
        {
            s1=s1+i;
        }
        for(int i=4;i<=20;i+=4)
        {
            s2=s2+i;
        }
        s=s1-s2;
        System.out.println("Sum of first series = "+s);
    }

    void series(int x)
    {
        double s=0.0;
        for(int i=2;i<=20;i+=3)
        {
            s=s+((double)x/(double)i);
        }
        System.out.println("Sum of second series "+s);
    }

    static void main() throws IOException
    {
        OverLoadSeries ob=new OverLoadSeries();
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader (read);

        ob.series();

        System.out.println("Enter a no.");
        int a=Integer.parseInt(in.readLine());
        ob.series(a);
    }
}

