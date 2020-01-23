package Arrays;      
import java.io.*;    
public class Array_6
{                   
    static void main()throws IOException //Concatting two arrays
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int a[]={1,2,3,4,5};
        System.out.println("Contents of A: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
        int b[]={10,20,30,40,50};
        System.out.println("Contents of B: ");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
        int c[]=new int[a.length+b.length];

        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[i-a.length];
            }
        }
        System.out.println("Contents of C: ");
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
