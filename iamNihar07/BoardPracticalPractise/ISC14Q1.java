package BoardPracticalPractise;
import java.util.*;

public class ISC14Q1
{
    int m,n;
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        
        do
        {
            ISC14Q1 ob=new ISC14Q1();
            ob.input();
            ob.display();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter M");
            m=sc.nextInt();
            
            System.out.println("Enter N");
            n=sc.nextInt();
            
            if(m<n)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }
    
    void display()
    {
        int f=0;
        System.out.println("The composite magic numbers are: ");
        for(int i=m;i<=n;i++)
        {
            if(comp(i)==true && magic(i)==true)
            {
                System.out.print(i+", ");
                f++;
            }
        }
        System.out.println();
        System.out.println("Freq of comp magic numbers= "+f);
    }
    
    boolean comp(int x)
    {
        boolean flag=false;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
    
    boolean magic(int x)
    {
        int s=0,a=0;
        while(x>9)
        {
            s=0;
            while(x!=0)
            {
                a=x%10;
                s=s+a;
                x=x/10;
            }
            x=s;
        }
        
        if(x==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
           
           
            
        

