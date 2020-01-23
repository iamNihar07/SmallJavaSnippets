import java.io.*;
public class Shift
{
    int mat[][];
    int m,n;

    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    Shift(int m, int n)
    {
        this.m=m;
        this.n=n;
        mat=new int[m][n];
    }

    void input()throws IOException
    {
        

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter an element.");
                mat[i][j]=Integer.parseInt(in.readLine());
            }
        }
    }

    void cyclic(Shift p)
    {
        Shift s=new Shift(m,n);
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                k=i-1;
                if(k<0)// if it exists in first row
                {
                    k=m-1; //then store in last row
                }
                s.mat[k][j]=p.mat[i][j];
            }
        }
        System.out.println();
        s.display();
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }        
    }

    static void main() throws IOException
    {
        System.out.println("Enter m & n <5");
        int m=Integer.parseInt(in.readLine());
        int n=Integer.parseInt(in.readLine());  
        if(m<5 && n<5)
        {
            Shift ob=new Shift(m,n);
            ob.input();
            ob.display();
            ob.cyclic(ob);
        }
    }
}
