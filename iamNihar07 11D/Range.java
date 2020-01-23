/**
 * All palprime in 100 to 500
 * All perfect in 100 to 500
 * All armstron in 100 to 500
 * 
 */
public class Range
{
    static void Palprime()
    {
        for(int n=100;n<=500;n++)
        {
            boolean flag =true;
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                int m=n,a=0,nn=0;
                while(m!=0)
                {
                    a=m%10;
                    nn=nn*10+a;
                    m=m/10;
                }
                if(nn==n)
                {
                    System.out.println(n);
                }
            }
        }
    }

    static void PerfectNumber() //perfect nummber range
    {
        for(int n=100;n<=500;n++)
        {
            int s=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    s=s+i;
                }
            }
            if(n==s)
            {
                System.out.println("Perfect no "+n);
            }            
        }
    }

    static void Armstrong() //armstrong range
    {
        for(int i=100;i<=500;i++)
        {
            int m=i;
            int a=0,s=0;
            while(m!=0)
            {
                a=m%10;
                s=s+(a*a*a);
                m=m/10;
            }

            if(s==i)
            {
                System.out.println(i);
            }            
        }
    }
}
