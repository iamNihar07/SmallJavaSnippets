import java.util.*;
public class DDA
{
    static int A[][];
    static int m;
    static Scanner sc=new Scanner(System.in);
    //7 4 1 9 5 8 2 6 10 19 13 1 3 5 1 10 0 5 12 16 1 8 17 6 8
    DDA(int m)
    {
        this.m=m;        
        A=new int[m][m];
    }

    void input()
    {        
        System.out.println("Enter the values.");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                while(true)
                {
                    A[i][j]=sc.nextInt();  
                    if(A[i][j]>=0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Enter positive values only.");
                    }
                }
            }
        }                
    }

    void display(int Z[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(Z[i][j]+" ");
            }
            System.out.println();
        }
    }

    void sort()
    {
        int temp[]=new int[(m-2)*(m-2)];
        int n=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>0 && j>0 && i<m-1 && j<m-1) //not a boundary element
                {
                    temp[n]=A[i][j];
                    n++;
                }
            }
        }

        int xyz=0;
        for(int i=0;i<temp.length-1;i++)
        {
            for(int j=i+1; j<temp.length;j++)
            {
                if(temp[j]<temp[i])
                {
                    xyz=temp[i];
                    temp[i]=temp[j];
                    temp[j]=xyz;
                }
            }
        }

        n=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>0 && j>0 && i<m-1 && j<m-1)
                {
                    A[i][j]=temp[n];
                    n++;
                }
            }
        }
    }

    int sum()
    {
        int sum1=0;
        for(int i=0;i<m;i++)
        {
            sum1=sum1+A[i][i];
        }
        for(int i=0;i<m;i++)
        {
            sum1=sum1+A[i][m-i-1];
        }
        if(m%2!=0)
        {
            sum1=sum1-A[m/2][m/2];
        }
        return sum1;
    }

    static void main()
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
                System.out.println("Please enter m within range.");
            }
        }
        DDA ob=new DDA(m);
        ob.input();
        System.out.println("Original Array:");
        ob.display(A);
        ob.sort();
        System.out.println("New Array:");
        ob.display(A);
        int d=ob.sum();
        System.out.println("Sum of diagonals = "+d);
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==j) || (i+j==(m-1)))
                {
                    System.out.print(A[i][j]);                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}        
