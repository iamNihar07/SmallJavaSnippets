package BoardPracticalPractise;
import java.util.*;

public class ISC16Q3
{
    String s;
    
    ISC16Q3()
    {
        s="";
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter a sentence terminating in .?! only.");
            s=sc.nextLine();
            if(s.endsWith(".") || s.endsWith("!") || s.endsWith("?"))
            {
                boolean flag=true;
                for(int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    if(Character.isLowerCase(ch)==true)
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
                    System.out.println("Enter uppercase characters only.");
                }
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }
    
    void countWords()
    {
        StringTokenizer st=new StringTokenizer(s,"!.? ");
        String w=""; 
        int f=0;
        String s1="",s2="";
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            char ch1=w.charAt(0);
            char ch2=w.charAt(w.length()-1);
            
            if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && (ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'))
            {
                f++;
                s1=s1+w+" ";
            }
            else
            {
                s2=s2+w+" ";
            }
        }
        s1.trim();
        s2.trim();
        System.out.println("Number of words beginning and ending with a vowel= "+f);
        System.out.println((s1+" "+s2)+s.charAt(s.length()-1));
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            ISC16Q3 ob=new ISC16Q3();
            ob.input();
            ob.countWords();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}
    
        
                
                
    