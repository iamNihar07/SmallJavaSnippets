package Arrays;
import java.io.*;
public class Array_01
{
    static void main() throws IOException //binary search in arrays with integers ascending order
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("int m[]={3,8,11,14,17};");
        int m[]={3,8,11,14,17};
        int lb=0;
        int ub=m.length-1;
        int cent=0;
        boolean flag=false;
        System.out.println();
        
        System.out.println("Enter the number to be searched for - ");
        int ns = Integer.parseInt(in.readLine());
        
        while(ub>=lb)
        {
            cent = (lb+ub)/2;
            if(m[cent]==ns)
            {
                flag=true;
                break;
            }
            if(m[cent]<ns)
            {
                lb=cent+1;
            }
            if(m[cent]>ns)
            {
                ub=cent-1;
            }
        }
        if(flag==true)
        {
            System.out.println(ns+" found at index "+cent+" & place "+(cent+1));
        }
        else
        {
            System.out.println(ns+" not found.");
        }
    }
}

            

    