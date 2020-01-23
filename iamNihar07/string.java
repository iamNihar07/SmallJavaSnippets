import java.io.*;
import java.util.*;
public class string
{
    String a[];
    int n;
    public static void main()throws IOException
    {
        string obj=new string();
        obj.input();
        obj.refine();
        obj.operation();
    }

    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        while(true)
        {
            System.out.println("Enter few sentences.(Maximum 5)");
            String m=buf.readLine();
            StringTokenizer s=new StringTokenizer(m,"!.?");
            n=s.countTokens();
            a=new String[n];
            if(n<=5)
            {
                for(int i=0;i<n;i++)
                    a[i]=s.nextToken();
                break;
            }
        }

    }

    void refine()
    {
        for(int i=0;i<n;i++)
        {
            StringTokenizer str=new StringTokenizer(a[i],"',");
            String st="";
            while(str.hasMoreTokens())
                st=st+str.nextToken()+" ";
            a[i]=st;
        }

    }

    void operation()
    {
        int max=maximum();
        String str="";
        for(int j=0;j<max;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(  a[i].length()>0)
                {
                    int n1=a[i].indexOf(' ');
                    str=str+a[i].substring(0,n1)+" ";
                    a[i]=a[i].substring(n1+1);
                }
            }
        }
        System.out.println(str);
    }

    int maximum()
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            StringTokenizer str=new StringTokenizer(a[i]," ,");
            int n1=str.countTokens();
            if(n1>max)
                max=n1;
        }
        return max;
    }    
}