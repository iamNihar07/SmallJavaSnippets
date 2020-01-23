package REVISION_80_MKS_PAPER_2012;
import java.io.*;
public class Q_10_4
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i=1,s=0,p=1;

        System.out.println("ENTER A No.");
        int n=Integer.parseInt(in.readLine());

        while(i<=10)

        {
            s=s+(p*i);
            p*=i;
        }
        System.out.println(s);
    }
}
