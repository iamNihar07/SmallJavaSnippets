import java.util.*;
/*#
 * Design a program to accept the amt from the user and display 
 * the breakup in descending order of denominatons along with the
 * total number of notes. Also print the amount in words acc to digis
 * Sample Input:
 * 14856
 * Sample Output:
 * One Four Eighth Five Six
 * Denominations
 * 2000*7 = 14,000
 * 500*1= 500
 * 100*3 = 300
 * 50*1= 50
 * 5*1 = 5
 * 1*1 = 1
 * total 14856
 * total no. of notes= 14
 * 
 * */
public class Demonitisation
{
    static int n;    
    String words[]={"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
    static Scanner sc=new Scanner(System.in);
    Demonitisation()
    {
        n=0;        
    }

    void accept()
    {
        while(true)
        {
            System.out.println("Enter the number.");
            n=sc.nextInt();
            if(n>0)
            {
                break;
            }
            System.out.println("Inappropriate input");
        }
    }

    void toWords()
    {
        int t=n;      
        int a=0,nn=0;
        while(t!=0)
        {
            a=t%10;
            nn=nn*10+a;
            t=t/10;
        }
        a=0;
        while(nn!=0)
        {
            a=nn%10;
            System.out.print(words[a]);  
            nn=nn/10;
        }
        System.out.println();
    }

    void breakup(int t)
    {        
        int q=0,w=0,e=0,r=0,y=0,u=0,i=0,o=0;
        if(t>=2000)
        {
            q=t/2000;
            t=t%2000;
            System.out.println("2000* "+q+"= "+(2000*q));
        }
        if(t>=500 & t<2000)
        {
            w=t/500;
            t=t%500;
            System.out.println("500* "+w+"= "+(500*w));
        }
        if(t>=100 && t<500)
        {
            e=t/100;
            t=t%100;
            System.out.println("100* "+e+"= "+(100*e));
        }
        if(t>=50 && t<100)
        {
            r=t/50;
            t=t%50;
            System.out.println("50* "+r+"= "+(50*r));
        }
        if(t>=20 && t<50)
        {
            y=t/20;
            t=t%20;
            System.out.println("20* "+y+"= "+(20*y));
        }
        if(t>=10 && t<20)
        {
            u=t/10;
            t=t%10;
            System.out.println("10* "+u+"= "+(10*u));
        }
        if(t>=5 && t<10)
        {
            i=t/5;
            t=t%5;
            System.out.println("5* "+i+"= "+(5*i));
        }
        if(t>=1 && t<5)
        {
            o=t;
            System.out.println("1* "+o+"= "+(o));
        }
        System.out.println("Total = "+n);
        System.out.println("No. of notes = "+(q+w+e+r+y+u+i+o));
    }
    

    public static void main()
    {
        int ch=0;
        do
        {
            System.out.print("\u000c");
            Demonitisation ob=new Demonitisation();
            ob.accept();
            ob.toWords();
            ob.breakup(n);
            System.out.println("Do you want to continue?");
            System.out.println("1 for yes, any other number for 0");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

 