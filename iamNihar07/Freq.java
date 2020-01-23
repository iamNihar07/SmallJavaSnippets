import java.util.*;
public class Freq
{
    String s;    
    StringTokenizer st;
    String m[];
    Freq()
    {
        s="";
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new sentence");
        s=sc.nextLine();
        st=new StringTokenizer(s,". ");
        m=new String[st.countTokens()];
    }

    void fillArray()
    {        
        int i=0;
        while(st.hasMoreTokens())
        {
            m[i]=st.nextToken();
            i++;
        }
    }

    void frq()
    {
        boolean flag=false;
        int f=0;
        for(int i=0;i<m.length;i++)
        {
            flag=false;
            f=0;
            for(int z=0;z<i;z++)
            {
                if(m[z].equalsIgnoreCase(m[i]))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                for(int z=i;z<m.length;z++)
                {
                    if(m[z].equalsIgnoreCase(m[i]))
                    {
                        f++;
                    }
                }
                System.out.println("Freq of word "+m[i]+" is "+f);
            }
        }
    }

    void display()
    {
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }

    static void main()
    {
        Freq ob=new Freq();
        ob.input();
        ob.fillArray();
        ob.frq();
    }

    void alphabetical()
    {
        String x="Nihar".toUpperCase();
        String alpha="";

        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<x.length();j++)
            {
                if(i==x.charAt(j))
                {
                    alpha=alpha+(char)i;
                }
            }
        }

        System.out.println("Alphabetical ordered string is "+alpha);
    }
    
    void number()
    {
        int x=3268;
        int nn=0,a=0;

        for(int i=0;i<=9;i++)
        {
            int m=x;
            while(m!=0)
            {
                a=m%10;
                if(a==i)
                {
                    nn=nn*10+i;
                }
                m=m/10;
            }
        }

        System.out.println("Number in order is "+nn);
    }
}

    
    
        