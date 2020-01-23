package For_Loop;
import java.io.*;
public class For_Loop1
{   void main()throws IOException
    { InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i = 1;
        int n=0;
        int sum=0;
        System.out.println("Enter the value of n");
        n = Integer.parseInt(in.readLine());
        for ( i=1;i<=n; i++)
        {  sum=sum+i;          //displaying the sum of 1 to n
        }   
        System.out.println("THe sum is "+sum);
    }

}