import java.util.*;
public class STokenizer
{
    Scanner sc=new Scanner(System.in);
    StringTokenizer sa, sb;
    String a,b;
    String s1[],s2[];

    void input()
    {
        System.out.println("Enter first sentence.");
        a=sc.nextLine();
        sa=new StringTokenizer(a,".? ");        
        s1=new String[sa.countTokens()];

        
        
        System.out.println("Enter second sentence.");
        b=sc.nextLine();
        sb=new StringTokenizer(b,".? ");
        s2=new String[sb.countTokens()];
    }

    void fillArray()
    {
        int i=0;
        while(sa.hasMoreTokens())
        {
            s1[i]=sa.nextToken();
            i++;
        }
        i=0;
        while(sb.hasMoreTokens())
        {
            s2[i]=sb.nextToken();
            i++;
        }        
    }

    void common()
    {
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i].equalsIgnoreCase(s2[j]))
                {                
                    System.out.println(s1[i]);
                }
            }
        }
    }

    static void main()
    {        
        STokenizer ob=new STokenizer();
        ob.input();        
        ob.fillArray();
        ob.common();
    }
}
