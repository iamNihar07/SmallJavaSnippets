package For_Loop;
import java.io.*;
public class For_Loop5
{
    void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a; int n; int i; int b; double s=0;
        System.out.println("Enter ur A.");
        a=Integer.parseInt(in.readLine());
        System.out.println("Enter ur N.");
        n=Integer.parseInt(in.readLine());
        for(i=1 ; i<=n ;i++ )
        { s=s+((double)i/n);}//displayin sum of a/1 + a/2 ......+ a/n
        System.out.println(s);
    }
}

        
        
        

  