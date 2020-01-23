import java.io.*;
public class Statistics
{
    static int n;
    static int arr[];

    static InputStreamReader read= new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    Statistics(int n)
    {
        this.n=n;
        arr=new int[n];
    }

    void input()throws IOException
    {
        int i=0;

        for(i=0;i<n;i++)
        {
            System.out.println("Enter the value.");
            arr[i]=Integer.parseInt(in.readLine());
        }
    }

    void display(int dummy[])
    {
        int i=0;

        System.out.println("Array Arr:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);            
        }

        System.out.println("\n Array x:");
        
        for(i=0;i<dummy.length;i++)
        {
            System.out.println(dummy[i]);            
        }
    }

    void calcMean(int dummy[])
    {
        int i=0;
        int s1=0;
        int s2=0;
        for(i=0;i<n;i++)
        {
            s1=s1+arr[i];
        }
        for(i=0;i<dummy.length;i++)
        {
            s2=s2+dummy[i];
        }
        double m1=s1/n;
        double m2=s2/dummy.length;

        System.out.println("Mean of arr = "+m1);
        System.out.println("Mean of dummy = "+m2);
        
    }

    public static void main()throws IOException
    {
        System.out.println("Enter the value of n");
        n=Integer.parseInt(in.readLine());
        Statistics ob=new Statistics(n);
        int x[]={1,2,3,4,5};
        ob.input();
        ob.display(x);
        ob.calcMean(x);
    }
}


        