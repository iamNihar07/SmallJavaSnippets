import java.util.*;

public class lol

{
    static void main()
    {
        String x="Sample sentence?this is.";
        StringTokenizer a=new StringTokenizer(x,".? ");
        int j=0;
        String s[]=new String[a.countTokens()];
        while(a.hasMoreTokens())
        {
            s[j]=a.nextToken();
            j++;
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
        String d="AAAA";
        System.out.println(d.indexOf('E'));
        
        Scanner sc=new Scanner("12, 2,3,  4,5").useDelimiter(", ");
        System.out.println(sc.next());
        System.out.println(sc.next());
    }
}