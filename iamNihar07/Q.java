import java.util.*;
public class Q
{    
    String a="",b="",s;   
    static Scanner sc1=new Scanner(System.in); 
   Q()
   {
       s="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);        
        while(true)
        {            
            System.out.println("Enter a sentence terminating in .?!");
            s=sc.nextLine();
            if(s.endsWith(".") || s.endsWith("?") ||s.endsWith("!"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input.");
            }
        }
        s=s.toUpperCase();
    }
    
    int countWords()
    {
        StringTokenizer st=new StringTokenizer(s,".?! ");
        String x="";
        int k=0;
        
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            char ch1=x.charAt(0);
            char ch2=x.charAt(x.length()-1);
            if((ch1=='A' || ch1=='E' ||ch1=='I' || ch1=='O' || ch1=='U') && 
            (ch2=='A' || ch2=='E' ||ch2=='I' || ch2=='O' || ch2=='U'))
            {
                k++;
                a=a+x+" ";
            }
            else
            {
                b=b+x+" ";
            }
        }
        return k;
    }
    
    void display()
    {
        System.out.println("No. of words= "+countWords());
        System.out.println((a+b).trim()+s.charAt(s.length()-1)); //not to forget the last character
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            Q ob=new Q();
            ob.input();
            ob.display();
            System.out.println("Do you wish to continue?");
            System.out.println("1=Yes / Any other number=No");
            n=sc1.nextInt();
        }while(n==1);
    }
}
        
            