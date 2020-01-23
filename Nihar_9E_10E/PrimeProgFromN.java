import java.io.*;

public class PrimeProgFromN
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int n=0;
        int i=0;
        int k=0;
        int j=0;
        int l=0;

        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());

        for(i=n;; i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {         
                if(i%j==0)
                {
                    k++;
                }
            }
            if(k==0)
            {
                System.out.println(i);
                l++;
            }
            if(l==5)
            {
                break;
            }
        }
    }
}
        
        
        
        

