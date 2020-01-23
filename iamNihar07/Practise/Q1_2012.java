package Practise;
import java.util.*;
public class Q1_2012
{
    int m,n;
    static Scanner sc=new Scanner(System.in);
    void input()
    {
        while(true)
        {
            System.out.println("Input m");
            m=sc.nextInt();
            System.out.println("Input n");
            n=sc.nextInt();
            if(m<3000 && n<3000 && m<n)
            {
                break;
            }
            else
            {
                System.out.println("OUT OF RANGE.");
            }
        }
    }

    void PalPrime()
    {
        int k=0;
        for(int i=m;i<=n;i++)
        {            
            boolean check=isPrime(i);

            if(check==true)
            {
                int t=i;
                int a=0,nn=0;
                while(t!=0)
                {
                    a=t%10;
                    nn=nn*10+a;
                    t=t/10;
                }

                if(nn==i)
                {
                    k++;
                    System.out.print(i+", ");
                }
            }
        }

        System.out.println();
        System.out.println("Frequency of Prime Pallindrome Integers: "+k);
    }

    boolean isPrime(int t)
    {
        boolean flag=true;
        for(int j=2;j<t;j++)
        {
            if(t%j==0)
            {
                flag=false;
                break;
            }
        }
        if(t==1)
        {
            flag=false;
        }
        return flag;
    }

    public static void main()
    {
        int ch=0;
        do
        {
            Q1_2012 ob=new Q1_2012();
            ob.input();
            ob.PalPrime();            
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}

    