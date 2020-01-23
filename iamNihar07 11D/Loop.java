/**Sum of 1 to 10
 * Even numbers till 200
 * Sum of 10 numbers entered by the user
 * */
import java.io.*;
public class Loop
{
    static void main1()
    {
        int s=0;
        for(int i=1;i<=10;i++)
        {
            s=s+i;
        }
        System.out.println(s);
    }
    static void main2()
    {
        for(int i=2;i<=200;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    static void SumOf10Numbers()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter a number=>");
            int n=Integer.parseInt(in.readLine());
            sum=sum+n;
        }
        System.out.println("Sum is "+sum);
        
    }
}