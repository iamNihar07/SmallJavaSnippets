package Practise;
import java.util.*;
public class Q1_2016
{
    int n;
    static Scanner sc=new Scanner(System.in);

    void input()
    {
        while(true)
        {
            System.out.println("Enter a positive whole no.");
            n=sc.nextInt();
            if(n>=0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input.");
            }
        }
    }

    void getBinEq()
    {
        int t=n;
        int a=0;
        String str="";
        while(t!=0)
        {
            a=t%2;
            str=a+str;
            t=t/2;
        }
        if(n==0)
        {
            str="0";
        }

        int bEq=Integer.parseInt(str);
        System.out.println("BINARY EQUIVALENT: "+bEq);

        t=bEq;
        a=0;
        int k=0;
        while(t!=0)
        {
            a=t%10;
            if(a==1)
            {
                k++;
            }
            t=t/10;
        }
        System.out.println("NO. OF 1's: "+k);
        
        if(k%2==0)
        {
            System.out.println("OUTPUT: EVIL NUMBER");
        }
        else
        {
            System.out.println("OUTPUT: NOT AN EVIL NUMBER.");
        }
    }

    public static void main()
    {
        int ch=0;
        do
        {
            Q1_2016 ob=new Q1_2016();
            ob.input();
            ob.getBinEq();
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}

        