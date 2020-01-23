package BoardPracticalPractise;
import java.util.*;
public class ISC15Q2
{
    int a[][];
    int m;
    
    ISC15Q2(int m)
    {
        this.m=m;
        a=new int[m][m];
    }
    
    void input()    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the values into the matrix:");
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
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    void rotate()
    {
        int b[][]=new int[m][m];        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=b[i][m-1-j];
            }
        }
        
        System.out.println("Rotated Matrix:");
        display();
    }
    
    void sumOfCorner()
    {
        int s=a[0][0]+a[0][m-1]+a[m-1][0]+a[m-1][m-1];
        System.out.println("Sum of corner elements= "+s);
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
                    System.out.println("Size out of range");
                }
            }
            
            ISC15Q2 ob=new ISC15Q2(m);
            ob.input();
            System.out.println("Original Matrix:");
            ob.display();
            ob.rotate();
            ob.sumOfCorner();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

                       
        
  