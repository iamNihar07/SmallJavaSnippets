
import java.io.*;
public class MaxMin
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int max=0,min=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter a number.");
            int n=Integer.parseInt(in.readLine());
            if(i==1)
            {
                max=n; min=n;
            }
            else
            {
                if(n>max)
                {
                    max=n;
                }
                else if(n<min)
                {
                    min=n;
                }
            }
        }
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
    }
}