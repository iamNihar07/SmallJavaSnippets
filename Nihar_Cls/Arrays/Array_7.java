package Arrays;      
import java.io.*;    
public class Array_7
{                   
    static void main()throws IOException //Concatting two arrays
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]={1,2,3,4,5};
        int b[]={10,20,30,40,50};
        int n=0;
        int i=0;
         int la=a.length;
         int lb=b.length;
         int lc=la+lb;
         int c[]=new int[lc];
        for(i=0;i<lc;i+=2)
        {
            c[i]=a[n];
            c[i+1]=b[n];
            n++;
        }
        System.out.println("displaying array c");
        for(i=0;i<lc;i++)
        {
            
            System.out.println(c[i]);
        }
    }
}
            
