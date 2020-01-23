package BoardPracticalPractise;
import java.util.*;

public class ISC13Q3
{
    String s;
    
    ISC13Q3()
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
            if(s.endsWith(".") || s.endsWith(",") || s.endsWith("!") || s.endsWith("?"))
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
    
    void pallindrome()
    {
        StringTokenizer st=new StringTokenizer(s,".,?! ");
        String w="";
        int k=0;
        while(st.hasMoreTokens())
        {
            String rw="";
            w=st.nextToken();            
            for(int i=0;i<w.length();i++)
            {
                char ch=w.charAt(i);
                rw=ch+rw;
            }
            
            if(rw.equals(w))
            {
                k++;
                System.out.print(w+" ");
            }
        }
        System.out.println();
        System.out.println("Number of pallindrome words= "+k);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            ISC13Q3 ob=new ISC13Q3();
            ob.input();
            ob.pallindrome();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

            
        
                        
                        
            