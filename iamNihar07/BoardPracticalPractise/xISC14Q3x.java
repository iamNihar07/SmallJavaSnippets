package BoardPracticalPractise;
import java.util.*;
public class xISC14Q3x
{
    String s;
    
    xISC14Q3x()
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
    
    void delete()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word to be deleted");
        String del=sc.next();
        System.out.println("Enter the position of the word");
        int pos=sc.nextInt();
        delete(del,pos);
    }
    
    
    void reduce()
    {
        StringTokenizer st=new StringTokenizer(s,".!? ");
        String w="",s1=""; 
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            s1=s1+w+" ";
        }
        s=s1.trim()+s.charAt(s.length()-1);
    }
    
    void delete(String del, int pos)
    {
        String w="";
        s=s+" ";
        String s2="";
        for(int i=pos;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(!(w.equalsIgnoreCase(del)))
                {
                    s2=s2+w+" ";
                }
                w="";
            }
        }
        System.out.println(s2);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            xISC14Q3x ob=new xISC14Q3x();
            ob.input();
            ob.reduce();
            ob.delete();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

            
    