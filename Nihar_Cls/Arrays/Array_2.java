package Arrays;      
import java.io.*;    
public class Array_2 
{                   
    static void main()throws IOException //checking for an integer in the array
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int m[]=new int[5];
        boolean flag=false;
        int i=0;
        System.out.println("Enter 5 values.");
        for(i=0;i<m.length;i++)
        {
            m[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("Enter the no. to be checked for in the array.");
        int n = Integer.parseInt(in.readLine());

        for(i=0;i<m.length;i++)
        {
            if(m[i] == n)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Found "+n+" at index "+i+" and position "+(i+1));
        }
        else
        {
            System.out.println(n+" not found in the array.");
        }
    }
}


