package For_Loop;
import java.io.*;
public class For_Loop10
{ public static void main()throws IOException //sum s=a + a^2/2 + a^3/3..+a^n/n
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Sum ofs=a + a^2/2 + a^3/3..+a^n/n");
        System.out.println("Enter a ");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter n ");
        int n=Integer.parseInt(in.readLine());
        double s = 0.0;
        int i,j=0;
        for(i=1;i<=n;i++)
        {
            double z=Math.pow(a,n);
            for(j=1; j<=n; j++)
            { s=z/j;
            }
        }
        System.out.println(s);
    }
}
        
        
        
        
        