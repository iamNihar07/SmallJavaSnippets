package BoardPracticalPractise;
import java.util.*;

public class ISC12Q2
{
    String s;

    ISC12Q2()
    {
        s="";
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);        
        while(true)
        {
            System.out.println("Enter the sentence");
            s=sc.nextLine();
            if(s.endsWith(".") || s.endsWith("!") || s.endsWith("?"))
            {
                boolean flag=true;
                for(int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    break;
                }
                else
                {
                    System.out.println("iNVALID input");
                }
            }
            else
            {
                System.out.println("invalid input");
            }
        }
    }

    void toArray()
    {
        StringTokenizer st=new StringTokenizer(s,".!? ");
        System.out.println("LENGTH: "+st.countTokens());
        String x[]=new String[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens())
        {
            x[i]=st.nextToken();
            i++;
        }

        String a[];
        a=sortArr(x);
        
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    String[] sortArr(String x[])
    {
       String temp="";
       
       for(int i=0;i<x.length-1;i++)
       {
           for(int j=i+1;j<x.length;j++)
           {
               if(x[j].compareToIgnoreCase(x[i])<0)
               {
                   temp=x[j];
                   x[j]=x[i];
                   x[i]=temp;
                }
            }
        }
        
       return x;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            ISC12Q2 ob=new ISC12Q2();
            ob.input();
            ob.toArray();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

    