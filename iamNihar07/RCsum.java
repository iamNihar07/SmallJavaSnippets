import java.util.*;
public class RCsum
{
    static Scanner sc=new Scanner(System.in);
    static void main()
    {
        System.out.println("Enter the value of n");
        int n=sc.nextInt();

        int m[][]=new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        int sumRow=0,sumCol=0;

        for(int i=0;i<n;i++)
        {
            sumRow=0;
            for(int j=0;j<n;j++)
            {
                sumRow=sumRow+m[i][j];
            }
            System.out.println("Sum of the "+i+" row is "+ sumRow);
        }

        for(int i=0;i<n;i++)
        {
            sumCol=0;
            for(int j=0;j<n;j++)
            {
                sumCol=sumCol+m[j][i];
            }
            System.out.println("Sum of the "+i+" column is "+ sumCol);
        }
    }
}

    