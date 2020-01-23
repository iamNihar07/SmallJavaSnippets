package BoardPracticalPractise;

import java.util.*;
public class ISC12Q1
{
    int m,n;

    void input()
    {
        Scanner  sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter m");
            m=sc.nextInt();
            System.out.println("Enter n");
            n=sc.nextInt();

            if(m<n && m<3000 && n<3000)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }

    boolean isPrime(int x)
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
    
    boolean isPallindrome(int x)
    {
        int t=x;
        int a=0,nn=0;
        while(x!=0)
        {
            a=x%10;
            nn=nn*10+a;
            x=x/10;
        }
        if(nn==t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void checkPalPrime()
    {
        int k=0;
        for(int i=m;i<=n;i++)
        {
            if(isPrime(i) &&  isPallindrome(i))
            {
                System.out.print(i+", ");
                k++;
            }
            
        }
        System.out.println();
        System.out.println("Freq of Palprime= "+k);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            ISC12Q1 ob=new ISC12Q1();
            ob.input();
            ob.checkPalPrime();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

    
        
