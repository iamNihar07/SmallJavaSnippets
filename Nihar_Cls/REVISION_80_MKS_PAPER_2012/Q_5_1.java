package REVISION_80_MKS_PAPER_2012;

import java.io.*;
public class Q_5_1
{
    void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter No.");
        int n=Integer.parseInt(in.readLine());
        int i1=2,a,s=0; int m=n; boolean flag=true;
        while(i1<n)
        {
            if (n%i1==0)
            {
                flag=false;
                break;
            } 

            i1++;
        }

        while(n!=0)
        {
            a=n%10;
            s=s*10+a;
            n=n/10;
        }

        if(flag=true && s==m)
        {
            System.out.println("PALPRIME");
        }
        else 
        {
            System.out.println("NOT PALPRIME");
        }
    }
}