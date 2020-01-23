package Arrays;
import java.io.*;
public class Array_12
{
    static void main() throws IOException //finding twinprimes in an array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a[]=new int[10];
        int i=0;

        for(i=0;i<a.length;i++)
        {
            System.out.print((i+1)+".");
            System.out.println(" Enter the number ");
            a[i]=Integer.parseInt(in.readLine());            
        }
        int x=0,j=0,m=0,n=0;
        int k1=0,k2=0;
        

        for(i=0;i<a.length;i++)
        { 
            m=a[i];
            for(x=2;x<m;x++)
            {
                k1=0;
                if(m%x==0)
                {
                    k1++;
                    break;
                }
            }

            if(k1==0)
            {
                for(j=i+1;j<(a.length);j++)
                {
                    k2=0;
                    n=a[j];
                    for(x=2;x<n;x++)
                    {
                        if(n%x==0)
                        {
                            k2++;
                            break;
                        }
                    }
                    
                    if(k2==0 && (m-n==2 || n-m==2))
                    {
                        System.out.println("Twin primes - "+a[i]+" & "+a[j]);
                    }
                }
            }
        }
    }
}
        
                        

