package Arrays.DDA;
//important to rotate Array clockwise by 90 deg
import java.io.*;
public class Rotation
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char ch;
        do
        {
            System.out.print("\u000c");
            int m=0;
            while(true)
            {
                System.out.println("Enter m");
                m=Integer.parseInt(in.readLine());
                if(m>2 && m<20)
                {
                    break;
                }
                else
                {
                    System.out.println("Enter a valid m");
                }
            }

            int A[][]=new int[m][m];
            System.out.println("Enter the elements.");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A[i][j]=Integer.parseInt(in.readLine());
                }
            }

            System.out.println("Array A is ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }

            int T[][]=new int[m][m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    T[i][j]=A[j][i];
                }
            }
            int M[][]=new int[m][m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    M[i][j]=T[i][m-1-j];
                }
            }

            System.out.println("Array A rotated 90 degree is ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(M[i][j]);
                }
                System.out.println();
            }

            int s=A[0][0]+A[0][m-1]+A[m-1][0]+A[m-1][m-1];
            System.out.println("Sum of corner elements is "+s);
            
            System.out.println("Do u wish to continue? Press Y if yes");
            ch=in.readLine().charAt(0);
        }while(ch=='Y' || ch=='y');
    }
}
