import java.util.*;
public class RecursePal
{
    static int no,n;
    static String str,b="";

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.");
        no=sc.nextInt();
        System.out.println("Enter the string.");
        str=sc.next();
    }

    String isPallin(String str)
    {                  
        if(b.length()==this.str.length())
        {
            return b;
        }
        b=b+str.charAt(str.length()-1);
        return isPallin(str.substring(0,str.length()-1));
    }

    int isPalin(int no)
    {     
        int nn=0;
        int a=no%10;
        nn=nn*10+a;
        return no/10;
    }

    static void main()
    {
        Scanner sc=new Scanner(System.in);
        RecursePal ob=new RecursePal();
        ob.input();
        String x=ob.isPallin(str);
        System.out.println(x);
        int y=ob.isPallin(no);
        System.out.println(y);
    }
}
