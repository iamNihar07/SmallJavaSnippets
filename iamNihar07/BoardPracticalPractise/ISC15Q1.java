package BoardPracticalPractise;
import java.util.*;
public class ISC15Q1
{
    int N,M;

    ISC15Q1(int M,int N)
    {
        this.N=N;
        this.M=M;
    }

    void searchNumber()
    {
        int no=0;
        for(int i=M;;i++)
        {
            if(sumOfDigits(i)==N)
            {
                no=i;
                break;
            }
        }

        System.out.println("The required number is "+no);
        System.out.println("Total number of digits "+ndig(no));
    }

    int sumOfDigits(int t)
    {
        int a=0,s=0;
        while(t!=0)
        {
            a=t%10;
            s=s+a;
            t=t/10;
        }
        return s;
    }

    int ndig(int t)
    {
        int d=0;
        while(t!=0)
        {
            d++;
            t=t/10;
        }
        return d;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        int M=0,N=0;
        do
        {
            while(true)
            {
                System.out.println("Enter M");
                M=sc.nextInt();
                System.out.println("Enter N");
                N=sc.nextInt();
                if(M>=100 && M<=10000 && N<100)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }                
            }

            ISC15Q1 ob=new ISC15Q1(M,N);
            ob.searchNumber();

            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

        