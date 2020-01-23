package PracticalQs;
import java.io.*;
public class practical2
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char ch;
        int m=0,n=0;
        do
        {
            System.out.print("\u000c");
            while(true)
            {
                System.out.println("Enter m");
                m=Integer.parseInt(in.readLine());
                System.out.println("Enter n greater than m");
                n=Integer.parseInt(in.readLine());
                if(n>m && m>0)
                {
                    break;
                }
                else
                {
                    System.out.println("Plz follow the onscreen instructions.");
                }
            }

            int k=0;
            for(int i=m;i<=n;i++)
            {
                boolean a1=Prime(i);
                boolean a2=Pallindrome(i);
                if(a1==true && a2==true)
                {
                    k++;
                    System.out.println(i);
                }
            }
            
            System.out.println("Frequency of Prime pallindrome = "+k);
            System.out.println("Do u wish to continue? Press Y if yes");
            ch=in.readLine().charAt(0);
        }while(ch=='Y' || ch=='y');
    }

    boolean Prime(int x)
    {
        boolean flag=true;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=false;
                break;
            }
        }

        if(flag==true && x!=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean Pallindrome(int x)
    {
        int m=x,a=0,nn=0;
        while(x!=0)
        {
            a=x%10;
            nn=nn*10+a;
            x=x/10;
        }
        if(nn==m)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
