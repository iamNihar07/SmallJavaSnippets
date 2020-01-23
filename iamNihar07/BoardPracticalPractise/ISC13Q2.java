package BoardPracticalPractise;

import java.util.*;
public class ISC13Q2
{
    int A[][];
    int M;

    ISC13Q2(int M)
    {
        this.M=M;
        A=new int[M][M];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values:");

        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }

    void display(int z[][])
    {
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(z[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void mirror()
    {
        int b[][]=new int[M][M];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                b[i][j]=A[i][M-1-j];
            }
        }
        System.out.println("MIRROR IMAGE:");
        display(b);
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
                System.out.println("Enter the order of matrix A");
                m=sc.nextInt();
                if(m>2 && m<20)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }

            ISC13Q2 ob=new ISC13Q2(m);
            ob.input();
            System.out.println("Original Matrix:");
            ob.display(ob.A);
            ob.mirror();

            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

