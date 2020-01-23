import java.util.*;

public class Term2Q2
{
    int A[][];
    static int m,n;
    static Scanner sc=new Scanner(System.in);

    Term2Q2(int m,int n)
    {
        this.m=m;
        this.n=n;
        A=new int[m][n];
    }

    void input()
    {
        System.out.println("Enter positive numbers into matrix A");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
                if(A[i][j]<0)
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
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    int sort()
    {
        int k= (m*2)+(n*2)-4; //draw 4 by 4 matrixx to understand

        int temp[]=new int[k];
        int t=0;

        for(int i=0;i<n;i++)
        {
            temp[t]=A[0][i];
            t++;
        }
        for(int i=1;i<m;i++)
        {
            temp[t]=A[i][n-1];
            t++;
        }
        for(int i=n-2;i>=0;i--)
        {
            temp[t]=A[m-1][i];
            t++;
        }
        for(int i=m-2;i>0;i--)
        {
            temp[t]=A[i][0];
            t++;
        }

        int tc=0;
        for(int i=0;i<temp.length;i++)
        {
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[j]<temp[i])
                {
                    tc=temp[i];
                    temp[i]=temp[j];
                    temp[j]=tc;
                }
            }
        }

        t=0;
        for(int i=0;i<n;i++)
        {
            A[0][i]=temp[t];
            t++;
        }
        for(int i=1;i<m;i++)
        {
            A[i][n-1]=temp[t];
            t++;
        }
        for(int i=n-2;i>=0;i--)
        {
            A[m-1][i]=temp[t];
            t++;
        }
        for(int i=m-2;i>0;i--)
        {
            A[i][0]=temp[t];
            t++;
        }

        int s=0;
        for(int i=0;i<temp.length;i++)
        {
            s=s+temp[i];
        }
        return s;
    }

    void fashiond()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==(m-1) || j==(n-1))
                {
                    System.out.print(A[i][j]+ "\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main()
    {
        
        int n=0;
        do
        {
            while(true)
            {
                System.out.println("Enter m and n greater than 2 and less than 20");
                m=sc.nextInt();
                n=sc.nextInt();
                if(m>2 && m<20 && n>2 && n<20)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }

            Term2Q2 ob=new Term2Q2(m,n);
            ob.input();
            System.out.println("Original Matrix:");
            ob.display();
            System.out.println("Rearranged Matrix:");
            int sum=ob.sort();
            ob.display();
            ob.fashiond();
            System.out.println("Sum of outer row and column elements= "+sum);
            System.out.println("DO you wish to continue. 1 for yes any othr number for no.");
            n=sc.nextInt();
        }
        while(n==1);
    }
}
