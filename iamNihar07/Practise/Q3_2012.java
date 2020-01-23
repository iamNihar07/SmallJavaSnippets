package Practise;
import java.util.*;
public class Q3_2012
{
    int A[][];
    static int m;
    static int n;
    static Scanner sc=new Scanner(System.in);

    Q3_2012(int m,int n)
    {
        A=new int[m][n];
    }

    void input()
    {
        System.out.println("Enter the elements.");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
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

    void maxmin()
    {
        int max=A[0][0];
        int min=A[0][0];
        int minr=0,minc=0;
        int maxr=0,maxc=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(A[i][j]<min)
                {
                    min=A[i][j];
                    minr=i;
                    minc=j;
                }
                if(A[i][j]>max)
                {
                    max=A[i][j];
                    maxr=i;
                    maxc=j;
                }
            }
        }

        System.out.println("Largest Number : "+max);
        System.out.println("Row = "+maxr);
        System.out.println("Column = "+maxc);
        System.out.println();
        System.out.println("Smallest Number : "+min);
        System.out.println("Row = "+minr);
        System.out.println("Column = "+minc);
    }

    void sort()
    {
        int temp[]=new int[m*n];
        int k=0;
        int t=0;
        int min=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[k]=A[i][j];
                k++;
            }
        }

        for(int i=0;i<temp.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[j]<temp[min])
                {
                    min=j;
                }
            }
            t=temp[i];
            temp[i]=temp[min];
            temp[min]=t;
        }

        k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=temp[k];
                k++;
            }
        }
    }

    public static void main()
    {
        int ch=0;       
        do
        {
            while(true)
            {
                System.out.println("Enter m & n respectively");
                m=sc.nextInt();
                n=sc.nextInt();
                if((m>2 && m<20) && (n>2 && n<20))
                {
                    break;
                }
                else
                {
                    System.out.println("Size out of range");
                }
            }
            Q3_2012 ob=new Q3_2012(m,n);
            ob.input();
            System.out.println("Original Matrix: ");
            ob.display();
            ob.maxmin();
            ob.sort();
            System.out.println("Rearranged Matrix: ");
            ob.display();
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}

    