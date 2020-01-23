package Functions;
import java.io.*;

public class palprime
{
    void palprime(int x,int n)
    {
        boolean flag=true;
        for(int r=x;r<=n;r++)
        {
            flag=true;
            for(int i=2;i<r;i++)
            {
                if(r%i==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true && r!=1)
            {
                int m=r;
                int a=0,nn=0;
                while(m!=0)
                {
                    a=m%10;
                    nn=nn*10+a;
                    m=m/10;
                }
                if(nn==r)
                {
                    System.out.println(r);
                }                
            }            
        }
    }

    static void main()throws IOException
    {
        palprime ob=new palprime();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter lower range.");
        int z1=Integer.parseInt(in.readLine());
        System.out.println("Enter higher range.");
        int z2=Integer.parseInt(in.readLine());
        ob.palprime(z1,z2);
    }
}