package Arrays;
import java.io.*;
public class Array_16
{
    static void main() throws IOException //finding max prime no
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" values");
            a[i]=Integer.parseInt(in.readLine());
        }
        
        int max=0,j=0; boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            flag=true;
            for(j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    flag = false;
                }                
            }
            if(flag==true && n>max)
            {
                max=n;
                
            }                 
            
        }
        System.out.println("Largest prime no. - "+max);

        
    }
}