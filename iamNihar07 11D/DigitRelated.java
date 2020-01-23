import java.io.*;
/**
 * Reversing Digits
 * Palindrome
 * Palprime
 * Armstrong
 * Twisted Prime
 * Twin Prime
 * Special Number/Krishnamurthy
 * No. of Digits? Then form an int having no. of digits and the digit
 * one's place. Eg. I/P=2136, O/P=46
 * Automorphic
 * Magic Number

 * */
public class DigitRelated
{
    static void ReversingDigits()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n;
        int a=0,nn=0;
        while(m!=0)
        {
            a=m%10;
            nn=nn*10+a;
            m=m/10;
        }
        System.out.println("Reversed Number= "+nn);
    }

    static void Pallindrome()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n;
        int a=0,nn=0;
        while(m!=0)
        {
            a=m%10;
            nn=nn*10+a;
            m=m/10;
        }

        if(nn==n)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Pallindrome Number");
        }
    }

    static void Palprime()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        boolean flag=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag=true)
        {
            int m=n;
            int a=0,nn=0;
            while(m!=0)
            {
                a=m%10;
                nn=nn*10+a;
                m=m/10;
            }
            if(nn==n)
            {
                System.out.println("Palprime Number");
            }
            else
            {
                System.out.println("Not a palprime number."); 
            }
        }
        else
        {
            System.out.println("Not a palprime number."); 
        }
    }

    static void Armstrong()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n;
        int a=0,s=0;
        while(m!=0)
        {
            a=m%10;
            s=s+(a*a*a);
            m=m/10;
        }

        if(s==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }

    static void TwistedPrime()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        boolean flaga=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flaga=false;
                break;
            }
        }
        if(flaga=true)
        {
            boolean flagb=true;
            int m=n;
            int a=0,nn=0;
            while(m!=0)
            {
                a=m%10;
                nn=nn*10+a;
                m=m/10;
            }
            for(int i=2;i<nn;i++)
            {
                if(nn%i==0)
                {
                    flagb=false;
                    break;
                }
            }
            if(flagb==true)
            {
                System.out.println("Twisted Prime.");
            }
            else
            {
                System.out.println("Not a Twisted prime");
            }
        }
        else
        {
            System.out.println("Not a Twisted prime");
        }
    }

    static void TwinPrime()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter first number.");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter second number.");
        int m=Integer.parseInt(in.readLine());
        boolean flaga=true, flagb=true;
        if(n-m==2 ||m-n==2)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flaga=false;
                    break;
                }
            }
            for(int i=2;i<m;i++)
            {
                if(m%i==0)
                {
                    flagb=false;
                    break;
                }
            }
            if(flaga==true && flagb==true)
            {
                System.out.println("Twin Primes.");
            }
            else
            { 
                System.out.println("Not Twin Primes.");
            }
        }
        else
        {
            System.out.println("Not Twin Primes.");
        }
    }

    static void Duck()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int a=0;
        boolean flag=false;
        while(n!=0)
        {
            a=n%10;
            if(a==0)
            {
                flag=true;
                break;
            }
            n=n/10;
        }
        if(flag==true)
        {
            System.out.println("Duck number.");
        }
        else
        {
            System.out.println("Not a Duck number.");
        }
    }

    static void Neon()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int sq=n*n;
        int a=0,s=0;
        while(sq!=0)
        {
            a=sq%10;
            s=s+a;
            sq=sq/10;
        }
        if(s==n)
        {
            System.out.println("Neon Number.");
        }
        else
        {
            System.out.println("Not Neon Number.");   
        }
    }

    static void Special()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n,f=1,s=0,a=0;
        while(m!=0)
        {
            a=m%10;
            f=1;
            for(int i=1;i<=a;i++)
            {
                f=f*i;
            }
            s=s+f;
            m=m/10;
        }
        if(s==n)
        {
            System.out.println("Special Number.");
        }
        else
        {
            System.out.println("Not a Special Number");
        }
    }

    static void Digit()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n,d=0;
        while(m!=0)
        {
            d++;
            m=m/10;
        }
        int nn=d*10+(n%10);
        System.out.println("New Number is "+nn);
    }

    static void Automorphic()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n;
        int sq=n*n;
        int d=0;
        while(m!=0)
        {
            d++;
            m=m/10;
        }

        if(n==(sq%(int)(Math.pow(10,d))))
        {
            System.out.println("Automorphic number");
        }
        else
        {
            System.out.println("Not an Automorphic number");   
        }
    }

    static void MagicNumber()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        int m=n; int s=0,a=0;
        
        while(m>9)
        {
            s=0;
            while(m!=0)
            {
                a=m%10;
                s=s+a;
                m=m/10;
            }
            m=s;
        }
        
        if(s==1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not a Magic Number");
        }
    }
}

