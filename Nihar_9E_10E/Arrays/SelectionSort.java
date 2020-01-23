package Arrays;
import java.io.*;
public class SelectionSort

{
    static void main() throws IOException //Selection Sort in ascending
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m[]=new int[5];
        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter a number");
            m[i]=Integer.parseInt(in.readLine());
        }
        int j=0; int min=0; int t=0;
        for(int i=0;i<m.length-1;i++)
        {
            min=i;
            for(j=i+1;j<m.length;j++)
            {
                if(m[j]<m[min])
                {
                    min=j;
                }

            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        }

        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
}
