package Arrays;      
import java.io.*;    
public class Array_5
{                   
    static void main()throws IOException //finding max and min
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int n[]=new int[10];
        int max=0,min=0;
        int i=0;

        for(i=0;i<n.length;i++)
        {
            System.out.println("Enter the nos.");
            n[i]=Integer.parseInt(in.readLine());                                  
        }  

        max=n[0]; min=n[0];
        for(i=1;i<n.length;i++)
        {
            if(n[i]>max)
            {
                max=n[i];
            }
            if(n[i]<min)
            {
                min=n[i];
            }
        }
        System.out.println("The maximum of the array is "+max);
        System.out.println("The minimum of the array is "+min);
    }
}

        