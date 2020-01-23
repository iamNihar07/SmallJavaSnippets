
import java.util.*;
public class CircPrime
{
    int n,m;
    CircPrime()
    {
        n=0; m=0;
    }

    boolean input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT: \t N= ");
        n=sc.nextInt();
        System.out.println();
        if(n<=0)
        {
            System.out.println("Invalid Input.");
            return false;
        } return true;
    }

    void checkCirc()
    {
        int i;  m=n; int c=0;
        boolean b=false;
        boolean b2=false;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        m=n;
        System.out.println("OUTPUT:   "+n);

        for(i=1;i<=c;i++)
        {
            if(i==1)
            {
                b=checkPrime();
            }
            else
            {
                b=rearrange(c);
            }
            if(b==false)
            {
                b2=true;
            }
        }
        System.out.println();
        if(b2==false)
        {
            System.out.println(n+" IS A CIRCULAR PRIME");
        }
        else
        {
            System.out.println(n+" IS NOT A CIRCULAR PRIME");
        }
    }

    boolean rearrange(int ctr)
    {
        int n1;
        int num1=m;
        int num2=m;
        boolean boo=false;
        int a,b;
        a=(int)(num1/(Math.pow(10,ctr-1)));
        b=(int)(num2%(Math.pow(10,ctr-1)));
        m=(b*10)+a;

        boo=checkPrime();
        System.out.println("          "+m);
        return boo;
    }

    boolean checkPrime()
    {
        int ctr=0;
        boolean boo=false;
        int i;
        for(i=2;i<m;i++)
        {
            if((m%i)==0)
            {
                ctr++;
            }
        }
        if(ctr==0)
        {
            boo=true;
        }
        return boo;
    }

    static void main()
    {
        boolean b; int ch;
        do
        {
            Scanner sc=new Scanner(System.in);
            CircPrime ob=new CircPrime();

            b=ob.input();

            if(b==true)
            {
                ob.checkCirc();
            }
            System.out.println("Do you wish to enter again? Enter 1 for yes. Enter 0 for no.");

            ch=sc.nextInt();
        }
        while(ch==1);
    }
}

/*#
SAMPLE OUTPUT:

1.
INPUT: 	 N= 131

OUTPUT:   131
311
113

131 IS A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 197

OUTPUT:   197
971
719

197 IS A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 1193

OUTPUT:   1193
1931
9311
3119

1193 IS A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 29

OUTPUT:   29
92

29 IS NOT A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
0

2.
INPUT: 	 N= 111

OUTPUT:   111
111
111

111 IS NOT A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 97

OUTPUT:   97
79

97 IS A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 12345

OUTPUT:   12345
23451
34512
45123
51234

12345 IS NOT A CIRCULAR PRIME
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
0


3.
INPUT: 	 N= -5

Invalid Input.
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
1
INPUT: 	 N= 0

Invalid Input.
Do you wish to enter again? Enter 1 for yes. Enter 0 for no.
0
 */