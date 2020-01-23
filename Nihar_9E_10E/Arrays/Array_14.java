package Arrays;
import java.io.*;
public class Array_14
{
    static void main() throws IOException //merging two arrays
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your n.");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter your m.");
        int m=Integer.parseInt(in.readLine());

        int p[] = new int[n];
        int q[] = new int[m];
        int l=p.length+q.length;
        int r[] = new int[l];
        int i=0; int k=0; 
        System.out.println();

        for(i=0;i<p.length;i++)
        {
            System.out.println((i+1)+" Enter the values of Array P ");
            p[i]=Integer.parseInt(in.readLine());
        }
        System.out.println();
        for(i=0;i<q.length;i++)
        {
            System.out.println((i+1)+" Enter the values of Array Q ");
            q[i]=Integer.parseInt(in.readLine());
        }
        System.out.println();
        for(i=0;i<p.length;i++)
        {
            r[i]=p[i];
        }
        
        for(i=0;i<q.length;i++)
        {
            r[i+n]=q[k];
            k++;
        }
        System.out.println("Elements of array P as follows - ");
        for(i=0;i<p.length;i++)
        {
            System.out.println(p[i]);
        }
        System.out.println();

        System.out.println("Elements of array Q as follows - ");
        for(i=0;i<q.length;i++)
        {
            System.out.println(q[i]);
        }
        System.out.println();

        System.out.println("Elements of array R as follows - ");
        for(i=0;i<r.length;i++)
        {
            System.out.println(r[i]);
        }
    }
}


        