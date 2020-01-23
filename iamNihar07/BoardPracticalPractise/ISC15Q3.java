package BoardPracticalPractise;
import java.util.*;
public class ISC15Q3
{
    String s;

    ISC15Q3()
    {
        s="";
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("enter a sentence.");
            s=sc.nextLine();
            if(s.endsWith(".") || s.endsWith("?"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }

    void task1()
    {
        StringTokenizer st=new StringTokenizer(s,".? ");
        String w="";
        String s1="";

        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            char ch=w.charAt(0);
            ch=Character.toUpperCase(ch);
            s1=s1+ch+w.substring(1)+" ";
        }
        s1.trim();
        System.out.println(s1);
    }

    void task2()
    {
        StringTokenizer st=new StringTokenizer(s,".? ");
        String x="",w="";
        int vowel=0,cons=0;
        System.out.println("Word \t\t Vowels \t\t Consonents");
        
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            w=x.toUpperCase();
            vowel=0;
            cons=0;
            for(int i=0;i<w.length();i++)
            {
                char ch=w.charAt(i);
                if(Character.isLetter(ch))
                {
                    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                    {
                        vowel++;
                    }
                    else
                    {
                        cons++;
                    }
                }
            }
            System.out.println(x+"\t\t"+vowel+"\t\t"+cons);
        }
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            ISC15Q3 ob=new ISC15Q3();
            ob.input();
            ob.task1();
            ob.task2();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

        
            
            
                   

        