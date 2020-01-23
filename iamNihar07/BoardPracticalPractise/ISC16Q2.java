package BoardPracticalPractise;
import java.util.*;

public class ISC16Q2
{
    int a[][];
    int m;

    ISC16Q2(int m)
    {
        this.m=m;
        a=new int[m][m];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values into the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]<0)
                {
                    System.out.println("Enter positive values only.");
                    j--;
                }
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

    void rearrange()
    {
        int temp[]=new int[(m-2)*(m-2)];
        int n=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=0 && j!=0 && i!=m-1 && j!=m-1)
                {
                    temp[n]=a[i][j];
                    n++;
                }
            }
        }

        int t=0;
        for(int i=0;i<temp.length-1;i++)
        {
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[j]<temp[i])
                {
                    t=temp[j];
                    temp[j]=temp[i];
                    temp[i]=t;
                }
            }
        }

        n=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=0 && j!=0 && i!=m-1 && j!=m-1)
                {
                    a[i][j]=temp[n];
                    n++;
                }
            }
        }        

    }

    void rearrangedDisplay()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || i+j==m-1)
                {
                    System.out.print(a[i][j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }                
            }
            System.out.println();
        }
    }

    void sumOfDiagonals()
    {
        int sum=0;

        for(int i=0;i<m;i++)
        {
            sum=sum+a[i][i];
        }
        for(int i=0;i<m;i++)
        {
            sum=sum+a[i][m-1-i];
        }

        if(m%2!=0)
        {
            sum=sum-a[m/2][m/2];
        }

        System.out.println("Sum of diagonal elements= "+sum);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        int m=0;
        do
        {
            while(true)
            {
                System.out.println("Enter the value of m");
                m=sc.nextInt();
                if(m>3 && m<10)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            
            ISC16Q2 ob=new ISC16Q2(m);
            ob.input();
            System.out.println("Original Matrix: ");
            ob.display();
            ob.rearrange();
            System.out.println("Rearranged Matrix: ");
            ob.display();
            System.out.println("Diagonals: ");
            ob.rearrangedDisplay();
            ob.sumOfDiagonals();
            
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}
