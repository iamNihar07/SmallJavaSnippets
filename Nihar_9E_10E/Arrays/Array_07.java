package Arrays;
import java.io.*;
public class Array_07
{
    static void main() throws IOException //Finding palprime nos in an array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" values");
            a[i]=Integer.parseInt(in.readLine());
        }
        int z=0;

        for(int i=0;i<a.length;i++)
        {
            z=a[i];        
            int nn=0,r=0;        
            boolean flag=true;
            for(int j=2;j<z;j++)
            { 
                if(z%j==0)
                { 
                  flag=false;
                  break; 
                }
            }
            while(z!=0)
            {
                r=z%10;
                nn=nn*10+r;
                z=z/10;
            }
            if(a[i]==nn && flag==true)
            {
                System.out.println(a[i]+" is a PalPrime no. in the array");
            }            
        }
    }
}


