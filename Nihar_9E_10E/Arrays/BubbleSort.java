package Arrays;
import java.io.*;
public class BubbleSort

{
    static void main() throws IOException //Bubble Sort in ascending
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m[]=new int[5];
        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter a number");
            m[i]=Integer.parseInt(in.readLine());
        }
        int j=0; int t=0;
        for(int i=0;i<m.length;i++)
        {
            for(j=0;j<(m.length-i-1);j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println();

        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
}
