package Arrays;
import java.io.*;
/**
 * Acept 10 nos into 2 SDAs. Merge the nos of both the arrays in SDA. 
 * DIsplay elements of all 3 arrays. sort the elemtns of the merged
 * array using seq sort
 * 
 *Accept the names of 10 students and their resp tel nos in 2 SDAs
 *Search for a student. if found disp tel no. else display Student 
 *not found
 */
public class MergSort
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);   

        int a[]=new int[10];
        int b[]=new int[10];
        
        System.out.println("for array a:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=Integer.parseInt(in.readLine());            
        }
        System.out.println("for array b:");
        for(int i=0;i<b.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            b[i]=Integer.parseInt(in.readLine());            
        }        
        int n[]=new int[20];
        for(int i=0;i<10;i++)
        {
            n[i]=a[i];
            n[i+10]=b[i];
        }

        int temp=0;
        for(int i=0;i<20;i++)
        {
            for(int j=i+1;j<20;j++)
            {
                if(n[i]>n[j])
                {
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }

        System.out.println("Array A :");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Array B :");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        System.out.println("Array N :");
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}