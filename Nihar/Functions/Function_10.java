package Functions;
import java.io.*;
public class Function_10//Function with Menu 
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        Function_10 ob=new Function_10();
        int conti;
        int out=0;

        do
        {
            conti=0;
            System.out.println("\u000c");
            System.out.println("\t\t\t"+"1.Pallindrome.");
            System.out.println("\t\t\t"+"2.Prime.");
            System.out.println("\t\t\t"+"3.Armstrong.");
            System.out.println("\t\t\t"+"4.Exit.");
            System.out.print("\t\t\t"+"Enter choice "+(char)(10154));
            int ch=Integer.parseInt(in.readLine());
            int n=0;

            switch(ch)
            {
                case 1:           

                System.out.print("\t\t\t"+"Enter a number "+(char)(10154));
                n=Integer.parseInt(in.readLine());
                ob.pallindrome(n);                
                break;

                case 2:
                System.out.print("\t\t\t"+"Enter a nummber "+(char)(10154));
                n=Integer.parseInt(in.readLine());
                ob.prime(n);
                break;

                case 3:
                System.out.print("\t\t\t"+"Enter a number "+(char)(10154));
                n=Integer.parseInt(in.readLine());
                ob.armstrong(n);
                break;

                case 4:
                out=1;
                conti=0;
                break;

                default:
                System.out.print("\t\t\t"+"Wrong choice.");
            }

            if(out==0)
            {
                System.out.println("Press 1 to continue.");
                conti=Integer.parseInt(in.readLine());
            }
            else
            {
                System.out.println("Thank You.");
            }
        }
        while(conti==1);

        System.out.println("....");
    }

    void pallindrome(int n1)
    {
        int m=n1;
        int d=0,nn=0;

        while(m!=0)
        {
            d=m%10;
            nn=nn*10+d;
            m=m/10;
        }

        if(nn==n1)
        {
            System.out.println("Pallindrome Number.");
        }
        else
        {
            System.out.println("Not Pallindrome.");
        }
    }

    void prime(int n1)
    {
        int k=0;

        for(int i=2;i<n1;i++)
        {
            if(n1%i==0)
            {
                k++;
                break;
            }
        }

        if(k==0)
        {
            System.out.println("Prime number.");
        }
        else
        {
            System.out.println("Not Prime.");
        }
    }

    void armstrong(int n1)
    {
        int m=n1;
        int d=0,nn=0;

        while(m!=0)
        {
            d=m%10;
            nn=nn+(d*d*d);
            m=m/10;
        }

        if(nn==n1)
        {
            System.out.println("Armstrong number.");
        }
        else
        {
            System.out.println("Not Armstrong.");
        }
    }
}