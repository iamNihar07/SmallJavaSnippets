import java.util.*;

public class ascendingorder
{
    public static void main()

    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int temp=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-1;j++)
            {
                for(int k=j+1;k<4;k++)
                {
                    if(a[i][k]<a[i][j])
                    {
                        temp=a[i][k];
                        a[i][k]=a[i][j];
                        a[i][j]=temp;
                    }
                }
                
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
