package Practise;
import java.util.*;

public class Q2_2012
{
    String s;
    StringTokenizer a;
    static Scanner sc=new Scanner(System.in);

    Q2_2012()
    {
        s="";
    }

    void input()
    {
        Scanner sc1=new Scanner(System.in);
        boolean flag=true;
        while(true)
        {
            System.out.println("Enter a string ending in . ? ! , in uppercase letters only");
            s=sc1.nextLine();
            if(s.endsWith(".") ||  s.endsWith("?") || s.endsWith("!") || s.endsWith(","))
            {
                a=new StringTokenizer(s,".?!, ");
                flag=true;
                q:
                while(a.hasMoreTokens())
                {
                    String temp=a.nextToken();
                    for(int i=0;i<temp.length();i++)
                    {
                        char ch=temp.charAt(i);
                        if(Character.isUpperCase(ch)==false)
                        {
                            System.out.println("Invalid input");
                            flag=false;
                            break q;
                        }     
                    }
                }
                if(flag)
                {
                    break;
                }              

            }
        }
        a=new StringTokenizer(s,".?!, ");
    }

    int countWords()
    {
        return a.countTokens();
    }

    void arrange()
    {
        String x[]=new String[countWords()];
        System.out.println("Rearranged sentence: ");
        int k=0;
        String f="";
        while(a.hasMoreTokens())
        {
            x[k]=a.nextToken();
            k++;
        }

        int i=0,j=0;
        String flag="";
        for(i=1; i<x.length;i++)
        {
            flag=x[i];
            j=i-1;
            while(flag.compareToIgnoreCase(x[j])<0)
            {
                x[j+1]=x[j];
                j--;
                if(j<0)
                {
                    break;
                }
            }
            x[j+1]=flag;
        }

        for(i=0; i<x.length;i++)
        {
            f=f+x[i]+" ";
        }

        System.out.println(f.trim()+s.charAt(s.length()-1));
    }

    public static void main()
    {
        int ch=0;
        do
        {
            Q2_2012 ob=new Q2_2012();
            ob.input();
            System.out.println("Length : "+ob.countWords());
            ob.arrange();
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}
