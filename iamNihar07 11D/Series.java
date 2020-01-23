import java.io.*;
/**
 * WAP to find the sum of the following series
 * 1 s=1+a,a^2+a^3+... a^10 from user
 * 2 s=1/a + 2/a + 3/a + 4/a.....10/a; from user 
 * 3 s=1/2 - 1/4 + 1/8 upto n terms
 * 4 s=2-4+6-8+....-20
 * 5 s=x/2 + x/5 + x/8 + x/11+...... x/20
 * menu WAMDP:
 *  sum of following series- 
 *  1. s=0+3+8+15+24..n terms
 *  2. s=1/2 + 3/4 +5/6 + 7/8 +...19/20   
 * First 10 terms of -
 * 6  3, 6, 12, 24,...
 * 7  2, 5, 10, 17,...
 * 8  1+a^2/1! + a^3/2! + a^4/3!+....n
 * 9  s=a^2/2 + a^4/4 + a^6/6 .. n terms
 */
public class Series
{
    static void main1()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a");
        int a=Integer.parseInt(in.readLine());
        double s=0;
        for(int i=0;i<=10;i++)
        {
            s=s+(Math.pow(a,i));
        }
        System.out.println("Sum is "+s);
    }

    static void main2()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a");
        int a=Integer.parseInt(in.readLine());
        double s=0; 

        for(int i=1;i<=10;i++)
        {
            s=s+(i/a);
        }

        System.out.println("Sum is "+s);
    }

    static void main3() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        double s=0; 

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s-(1/Math.pow(2,i));
            }
            else
            {
                s=s+(1/Math.pow(2,i));
            }
        }
        System.out.println("Sum is "+s);
    }

    static void main4()
    {
        int k=1;
        int s=0;
        for(int i=2;i<=20;i+=2)
        {
            if(k%2==0)
            {
                s=s-i;                
            }
            else
            {
                s=s+i;
            }
            k++;
        }
        System.out.println("Sum is "+s);
    }

    static void main5() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter x");
        int x=Integer.parseInt(in.readLine());
        double s=0; 

        for(int i=2;i<=20;i+=3)
        {
            s=s+((double)x/i);
        }
        System.out.println("Sum is "+s);
    }

    static void menu()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("1. s=s=0+3+8+15+24..n terms");
        System.out.println("2. s=1/2 + 3/4 +5/6 + 7/8 +...19/20");
        System.out.println("Enter your choice.");
        int ch=Integer.parseInt(in.readLine());

        switch(ch)
        {
            case 1:
            System.out.println("Enter n");
            int n=Integer.parseInt(in.readLine());
            double s1=0;
            for(int i=1;i<=n;i++)
            {
                s1=s1+((Math.pow(i,2)-1));               
            }

            System.out.println("Sum is "+(int)s1);
            break;

            case 2:
            double s2=0;
            for(int i=1;i<=19;i+=2)
            {
                s2=s2+((double)i/(double)(i+1));
            }
            System.out.println("Sum is "+s2);
            break;

            default:
            System.out.println("Wrong choice.");
        }
    }

    static void main6()
    {
        int a=3;
        for(int i=1;i<=10;i++)
        {
            System.out.print(a+", ");
            a=a+a;
        }      
    }  

    static void main7()
    {
        int a=2,b=3;
        for(int i=1;i<=10;i++)
        {
            System.out.print(a+", ");
            a=a+b;
            b+=2;
        }
    }

    static void main8()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        double s=1;
        int z=2;
        int f=1;
        for(int i=1;i<=(n-1);i++)
        {
            for(int k=1;k<=(z-1);k++)
            {
                f=f*i;
            }
            s=s+((Math.pow(a,z))/f);
            z++;
        }
        System.out.println("Sum is "+s);
    }

    static void main9()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        int k=2; double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+Math.pow(a,k)/k;
            k+=2;            
        }
        System.out.println("Sum is "+s);
    }
}

