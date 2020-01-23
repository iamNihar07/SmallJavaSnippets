package Arrays;
import java.io.*;
public class Array_03
{
    static void main() throws IOException //binary search in arrays with strings ascending order
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("String m[]=ABC,ADC,BFG,DRT,HUI");
        String m[]={"ABC","ADC","BFG","DRT","HUI"};
        int lb=0;
        int ub=m.length-1;
        int cent=0;
        boolean flag=false;
        System.out.println();
        
        System.out.println("Enter the string to be searched for - ");
        String ns = in.readLine();
        
        while(ub>=lb)
        {
            cent = (lb+ub)/2;
            if(m[cent].compareTo(ns)==0)
            {
                flag=true;
                break;
            }
            if(m[cent].compareTo(ns)<0)
            {
                lb=cent+1;
            }
            if(m[cent].compareTo(ns)>0)
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

            

    