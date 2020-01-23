package For_Loop;
import java.io.*;
public class For_Loop11
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        int i,j=1;
        double s=0.0;
        for(i=1;i<=n;i+=2)
        {  
            s=s+(i/Math.pow(j,2));
            j++;            
        }
        System.out.println(s);
    }
}
            


        