package PracticalQs;
import java.io.*;

public class Q2
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int m=0,n=0; char ch;
        do
        {
            do
            {
                System.out.println("Enter m");
                m=Integer.parseInt(in.readLine());
                if(m>=2&&m<=20)
                {
                    break;
                }
                else
                {
                    System.out.println("plz enter a valid input");
                }
            }while(true);

            do
            {
                System.out.println("Enter n");
                n=Integer.parseInt(in.readLine());
                if(n>=2&&n<=20)
                {
                    break;
                }
                else
                {
                    System.out.println("plz enter a valid input");
                }
            }while(true);

            int a[][]=new int[m][n];

            System.out.println("plz enter the values for A[][]:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=Integer.parseInt(in.readLine());
                }
            }

            System.out.println("A[][] = ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

            int x1=0,x2=0,y1=0,y2=0;
            int max=a[0][0],min=a[0][0];

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(max<a[i][j])
                    {
                        max=a[i][j];
                        x1=i;
                        y1=j;
                    }
                    if(min>a[i][j])
                    {
                        x2=i;
                        y2=j;
                    }
                }
            }

            System.out.println("Max/Min \t Row \t Column");
            System.out.println("MAX \t "+max+"\t"+x1+"\t"+y1);
            System.out.println("MIN \t "+min+"\t"+x2+"\t"+y2);

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for( int k=j+1;k<n;k++)
                    {
                        if(a[i][j]>a[i][k])
                        {
                            int temp=a[i][j];
                            a[i][j]=a[i][k];
                            a[i][k]=temp;
                        }
                    }
                }
            }

            System.out.println("Do you want to continue the program?");
            System.out.println("Y for yes , N for no");
            ch=in.readLine().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}

