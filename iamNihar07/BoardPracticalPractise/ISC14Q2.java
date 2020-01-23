package BoardPracticalPractise;

import java.util.*;
public class ISC14Q2
{
    int a[][];
    int m;
    
    ISC14Q2(int m)
    {
        this.m=m;
        a=new int[m][m];
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values into the matrix.");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    void display()
    {
        System.out.println("Original Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    void checkSym()
    {
        boolean flag=true;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("The matrix is symmetric");
        }
        else
        {
            System.out.println("The matrix is not symmetric");
        }
    }
    
    void sumLD()
    {
        int s=0;
        for(int i=0;i<m;i++)
        {
            s=s+a[i][i];
        }System.out.println("Sum of LD: "+s);
    }
    
    void sumRD()
    {
        int s=0;
        for(int i=0;i<m;i++)
        {
            s=s+a[i][m-1-i];
        }
        System.out.println("Sum of RD: "+s);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0,m=0;
        do
        {
            while(true)
            {
                System.out.println("Enter m");
                m=sc.nextInt();
                if(m>2 && m<10)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            
            ISC14Q2 ob=new ISC14Q2(m);
            ob.input();
            ob.display();
            ob.checkSym();
            ob.sumLD();
            ob.sumRD();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

        
    
            
            
           