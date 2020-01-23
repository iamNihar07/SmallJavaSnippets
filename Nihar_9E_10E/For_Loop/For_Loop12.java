package For_Loop;
import java.io.*;
public class For_Loop12
{
    static void main() throws IOException
    {   
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a");
        double a=Double.parseDouble(in.readLine());
        double s=0;
        for(int i=1;i<=30;i+=3)
        {
            s=i/(Math.pow(a,i));
        }
        System.out.println(s+",");
    }
}
