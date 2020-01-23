import java.util.*;
public class Q2
{
    static Scanner sc=new Scanner(System.in);
    int a[][];
    static int n;

    Q2(int n)
    {
        a=new int[n][n];
    }
    
    void input()
    {
        System.out.println("Enter positive numbers into the matrix.");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]<0)
                {
                    System.out.println("Enter positive numbers only.");
                    j--;
                }
            }            
        }
    }

    void display()
    {
        System.out.println("Displaying matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void saddlePoint()
    {
        int i=0,j=0,min=a[0][0],max=a[0][0],minj=0;
        boolean flag=false;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    minj=j;
                }
            }
            
            for(int k=0;k<n;k++)
            {
                if(a[k][minj]>max)
                {
                    max=a[k][minj];
                }
            }

            if(min==max)
            {
                System.out.println("Saddle Point= "+min);
                flag=true;
                break;
            }
        }

        if(flag==false)
        {
            System.out.println("No saddle point.");
        }
    }

    

    void sort()
    {
        int i=0,j=0;
        int flag=0;

        for(i=1;i<n;i++)
        {
            flag=a[i][i];
            j=i-1;
            while(flag<a[j][j])
            {
                a[j+1][j+1]=a[j][j];
                j--;
                if(j<0)
                {
                    break;
                }
            }
            a[j+1][j+1]=flag;
        }
    }

    public static void main()
    {
        int ch=0;
        do
        {            
            while(true)
            {
                System.out.println("Enter n<20");
                n=sc.nextInt();
                if(n<20)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Input.");
                }
            }

            Q2 ob=new Q2(n);
            ob.input();
            ob.display();
            ob.saddlePoint();
            ob.sort();
            ob.display();

            System.out.println("Do you wish to continue?");
            System.out.println("1=Yes/ Any other no. =No");
            ch=sc.nextInt();
            System.out.print("\u000c");
        }while(ch==1);
    }
}

