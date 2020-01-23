package Practise;
import java.util.*;
public class Q2_2016
{
    String s;
    StringTokenizer a;
    static Scanner sc=new Scanner(System.in);
    String x[];
    int x1[];

    Q2_2016()
    {
        s="";
    }

    void input()
    {
        Scanner sc1=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a sentence terminating in . ? ! only.");
            s=sc1.nextLine();
            if(s.endsWith(".") || s.endsWith("?") || s.endsWith("!"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }
        s=s.toUpperCase();
    }

    void toArray()
    {
        a=new StringTokenizer(s,".?! ");
        x=new String[a.countTokens()];
        x1=new int[a.countTokens()];
        int i=0;
        while(a.hasMoreTokens())
        {
            x[i]=a.nextToken();
            i++;
        }
    }

    void decode()
    {
        String s1="";
        int sum=0;        
        for(int i=0;i<x.length;i++)
        {
            s1=x[i];       
            sum=0;
            for(int j=0;j<s1.length();j++)
            {
                char ch=s1.charAt(j);
                sum=sum+(ch-64);                
            }
            System.out.println(s1+" =  "+sum);
            x1[i]=sum;
        }

    }

    void sort()
    {
        String t="";
        int t1=0;
        String f="";
        boolean flag=false;
        for(int i=0;i<x1.length-1;i++)
        {
            for(int j=0;j<x1.length-i-1;j++)
            {
                if(x1[j]>x1[j+1])
                {
                    t=x[j];
                    x[j]=x[j+1];
                    x[j+1]=t;
                    t1=x1[j];
                    x1[j]=x1[j+1];
                    x1[j+1]=t1;
                }
            }
        }

        int z=0;
        for(int i=0;i<x1.length;i++)
        {
            flag=false;
            for(z=0;z<i;z++)
            {
                if(x[z].compareToIgnoreCase(x[i])==0)
                {
                    flag=true;
                    break;
                }
            }

            if(flag==false)
            {
                f=f+x[i]+" ";
            }

        }
        System.out.println(f.trim()+s.charAt(s.length()-1));
    }

    public static void main()
    {
        int ch=0;
        do
        {
            Q2_2016 ob=new Q2_2016();
            ob.input();
            ob.toArray();
            ob.decode();
            ob.sort();
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}